package com.prc.desiners.组合模式.demo2;

import java.util.ArrayList;

/**
 * demo2
 *   安全式
 *      树枝构件
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


    @Override
    public void Display() {
        for(Object obj:children){
            ((Component)obj).Display();
        }
    }
}
