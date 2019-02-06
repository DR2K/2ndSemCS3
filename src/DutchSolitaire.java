import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class DutchSolitaire extends JFrame {
    private static final int WIDTH = 1030;
    private static final int HEIGHT = 430;
    private Image[][] cards;
    private String[][] cardInd;
    private Integer x1;
    private Integer y1;
    private Integer x2;
    private Integer y2;
    private String[][] order;
    private boolean win;

    public static void main(String[] args) {
        DutchSolitaire m = new DutchSolitaire();
        try {
            while (true) {
                m.repaint();
                Thread.sleep(1000 / 60);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics window) {
        int coordX = 2;
        int coordY = 23;
        for (int x = 0; x < cards.length; x++) {
            for (int y = 0; y < cards[x].length; y++) {
                window.drawImage(cards[x][y], coordX, coordY, null);
                coordX += 73;
            }

            coordX = 2;
            coordY += 97;
        }

        if (win) {
            window.setColor(Color.black);
            window.fillRect(400,100,300,200);
            window.setColor(Color.white);
            window.fillRect(425,125,250,150);
            window.setFont(new Font("Lato",Font.ITALIC,20));
            window.setColor(Color.black);
            window.drawString("cool.",600,270);

        }
    }

    private void createCards() {
        ArrayList<String> cardChooser = new ArrayList<>();
        String[] suits = {"c", "d", "h", "s"};
        for (int c = 0; c < 4; c++) {
            for (int x = 2; x < 16; x++) {
                if (x != 14)
                    cardChooser.add(x + suits[c]);
                if (x != 15)
                    order[c][x - 2] = x + suits[c];
            }
        }

        int len = 0;
        int width = 0;
        Collections.shuffle(cardChooser);
        String path = "/Users/devdeeprajpal/Cards/";
        for (int x = 0; x < cardChooser.size(); x = x) {
            try {
                cardInd[width][len] = cardChooser.get(x);
                cards[width][len] = ImageIO.read(new File(path + cardChooser.get(x) + ".gif"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            len++;
            x++;
            if (x != 0 && x % 13 == 0) {
                width++;
                len = 0;
            }
        }
        try {
            cardInd[0][13] = "14c";
            cardInd[1][13] = "14d";
            cardInd[2][13] = "14h";
            cardInd[3][13] = "14s";

            cards[0][13] = ImageIO.read(new File(path + "14c.gif"));
            cards[1][13] = ImageIO.read(new File(path + "14d.gif"));
            cards[2][13] = ImageIO.read(new File(path + "14h.gif"));
            cards[3][13] = ImageIO.read(new File(path + "14s.gif"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void swap(int x1, int y1, int x2, int y2) throws ArrayIndexOutOfBoundsException {

        x1 = (x1 - 2) / 73;
        x2 = (x2 - 2) / 73;
        y1 = (y1 - 23) / 97;
        y2 = (y2 - 23) / 97;

        if (validSwap(y1, x1, y2, x2)) {
            Image temp = cards[y1][x1];
            String tempInd = cardInd[y1][x1];

            cards[y1][x1] = cards[y2][x2];
            cardInd[y1][x1] = cardInd[y2][x2];

            cardInd[y2][x2] = tempInd;
            cards[y2][x2] = temp;
        }
    }

    private boolean validSwap(int y1, int x1, int y2, int x2) {
        String a = cardInd[y1][x1];
        String b = cardInd[y2][x2];
        String comp = "";
        Boolean aB = null;
        String oneLess = "";
        String oneMore;

        if (a.contains("15")) {
            comp = b;
            aB = true;
        }
        if (b.contains("15")) {
            comp = a;
            aB = false;
        }
        if (a.contains("14") || b.contains("14")) return false;

        if (!comp.equals("") && aB != null) {
            if (aB) {
                if (x1 != 0)
                    oneLess = cardInd[y1][x1 - 1];
                oneMore = cardInd[y1][x1 + 1];
                if (comp.contains("2") && !comp.contains("12") && x1 == 0) return true;

                if (x1 != 0 && comp.endsWith(oneLess.substring(oneLess.length() - 1)))
                    if (Integer.parseInt(comp.substring(0, comp.length() - 1)) > Integer.parseInt(oneLess.substring(0, oneLess.length() - 1)))
                        return true;

                if (comp.endsWith(oneMore.substring(oneMore.length() - 1)))
                    if (Integer.parseInt(comp.substring(0, comp.length() - 1)) < Integer.parseInt(oneMore.substring(0, oneMore.length() - 1)))
                        return true;
            } else {
                if (x2 != 0)
                    oneLess = cardInd[y2][x2 - 1];
                oneMore = cardInd[y2][x2 + 1];
                if (comp.contains("2") && !comp.contains("12") && x2 == 0) return true;

                if (x2 != 0 && comp.endsWith(oneLess.substring(oneLess.length() - 1)))
                    if (Integer.parseInt(comp.substring(0, comp.length() - 1)) > Integer.parseInt(oneLess.substring(0, oneLess.length() - 1)))
                        return true;

                if (comp.endsWith(oneMore.substring(oneMore.length() - 1)))
                    if (Integer.parseInt(comp.substring(0, comp.length() - 1)) < Integer.parseInt(oneMore.substring(0, oneMore.length() - 1)))
                        return true;
            }
        }
        return false;
    }

    public void update(Graphics window) {
        paint(window);
    }

    private void winCheck() {
        win = true;
        for (int r = 0; r < order.length; r++)
            for (int c = 0; c < order[r].length; c++)
                if (!order[r][c].equals(cardInd[r][c + 1]))
                    win = false;
    }

    public DutchSolitaire() {
        super("Dutch Solitaire");
        cards = new Image[4][14];
        cardInd = new String[4][14];
        order = new String[4][13];
        win = false;
        createCards();
        setSize(WIDTH, HEIGHT);
        setBackground(Color.black);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if (x1 == null) {
                    x1 = e.getX();
                    y1 = e.getY();
                } else {
                    x2 = e.getX();
                    y2 = e.getY();
                    swap(x1, y1, x2, y2);
                    x1 = y1 = x2 = y2 = null;
                    winCheck();
                }
            }
        });
        setVisible(true);
    }
}