package com.prc.desiners.访问者模式.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectStructure {

    private List<Element> list = new ArrayList<Element>();

    public void accept(Visitor visitor) {
        Iterator<Element> i = list.iterator();
        while (i.hasNext()) {
            ((Element) i.next()).accept(visitor);
        }
    }

    public void add(Element element) {
        list.add(element);
    }

    public void remove(Element element) {
        list.remove(element);
    }
}
