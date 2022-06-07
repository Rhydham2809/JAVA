interface EventListner
{
    public void performEvent();
}
interface MouseListner extends EventListner
{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();
}
interface KeyListner extends EventListner
{
    public void keyPressed();
    public void keyReleased();
}
class EventDemo implements MouseListner,KeyListner
{
    @Override
    public void keyPressed() {
        System.out.println("KEYPRESSED");
    }

    @Override
    public void keyReleased() {
        System.out.println("KEYRELEASED");
    }

    @Override
    public void mouseClicked() {
        System.out.println("MOUSECLICKED");
    }

    @Override
    public void mouseDragged() {
        System.out.println("MOUSEDRAGGED");
    }

    @Override
    public void mouseMoved() {
        System.out.println("MOUSEMOVED");
    }

    @Override
    public void mousePressed() {
        System.out.println("MOUSEPRESSED");
    }

    @Override
    public void mouseReleased() {
        System.out.println("MOUSERELEASED");
    }

    @Override
    public void performEvent() {
        System.out.println("PERFORMEVENT");
    }
}
public class Lab_7_4
{
    public static void main(String[] args)
    {
        EventDemo ed = new EventDemo();
        ed.keyPressed();
        ed.keyReleased();
        ed.mouseClicked();
        ed.mouseDragged();
        ed.mouseMoved();
        ed.mousePressed();
        ed.mouseReleased();
        ed.performEvent();
    }
}

