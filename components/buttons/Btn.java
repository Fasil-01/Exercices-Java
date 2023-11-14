
package components.buttons;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Btn extends JButton{
  
  private boolean over;
  private Color color;
  private Color colorOver;
  private Color colorClick;
  private Color colorBorder;
  private int radius = 5;
 
  
  public Btn(String text){
    super("<htm><p color=white>"+text+"</p></html>");
    super.setBorder(null);
    super.setSize(40,100);
  this.initComponents();
  this.addMouseListener(new MouseAdapter(){
    @Override
     public void mouseEntered(MouseEvent mv){
       setBackground(colorOver);
       setOver(true);
     }
     @Override
     public void mouseExited(MouseEvent mv){
       setBackground(color);
       setOver(false);
     }
     @Override
     public void mousePressed(MouseEvent mv){
       setBackground(colorClick);
     }
     @Override
     public void mouseReleased(MouseEvent mv){
      if(isOver())
         setBackground(colorOver);
      else
       setBackground(color);
     }

   });
  }
  private void initComponents(){
   over = false;
  color = Color.BLUE;
  setBackground(color);
   colorOver = Color.GREEN;
  colorClick = Color.RED;
   colorBorder = Color.BLACK;
   setContentAreaFilled(false);
  }
  
  @Override
  protected void paintComponent(Graphics graphics){
    super.paintComponent(graphics);
    Graphics2D g2 =(Graphics2D)graphics;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setColor(colorBorder);
    g2.fillRoundRect(0, 0, getWidth(), getHeight(),radius,radius);
    g2.setColor(getBackground());
    g2.fillRoundRect(2, 2, getWidth()-4, getHeight()-4,radius,radius);
    super.paintComponent(graphics);
  }

    
  public boolean isOver() {
    return over;
  }
  public void setOver(boolean over) {
    this.over = over;
  }

   public Color getColor() {
    return color;
  }
  public void setColor(Color color) {
    this.color = color;
    this.setBackground(color);
  }
  public Color getColorOver() {
    return colorOver;
  }
  public void setColorOver(Color colorOver) {
    this.colorOver = colorOver;
  }
   public Color getColorClick() {
    return colorClick;
  }
  public void setColorClick(Color colorClick) {
    this.colorClick = colorClick;
  }
  public Color getColorBorder() {
    return colorBorder;
  }
  public void setColorBorder(Color colorBorder) {
    this.colorBorder = colorBorder;
  }
   public int getRadius() {
    return radius;
  }
  public void setRadius(int radius) {
    this.radius = radius;
  }
  
}