package com.prc.desiners.组合模式.demo1;

import java.util.ArrayList;

/**
 * demo1
 *  透明模式
 *      树枝构件 Composite
 *
 *      非叶子节点  可理解为文件夹
 */
public class Composite implements Component{

    // 叶子列表
    private ArrayList<Component> children=new ArrayList<Component>();

    public void add(Component c) {
        children.add(c);
    }

    public void remove(Component c) {
        children.remove(c);
    }

    public Component getChild(int i) {
        return children.get(i);
    }

    // 重写操作方法
    public void operation() {
        for(Object obj:children){
            ((Component)obj).operation();
        }
    }
}
