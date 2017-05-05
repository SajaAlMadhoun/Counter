//https://www.youtube.com/watch?v=H8kXBL2Qu3A&feature=youtu.be
//فيديو لشرح كيفية كتابة هذا الكود
public class Counter {
    private int value=0;
    public void click(){
        value=value+1;
    }
    public void unclick(){
        value = value-1;
    }
    public void reset(){
        value=0;
    }
    public int getvalue(){
        return value;
        
    }
}
