package Interface;

/**
 * 表示元素的接口。
 * Created by 李伟民 on 17/7/18.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
