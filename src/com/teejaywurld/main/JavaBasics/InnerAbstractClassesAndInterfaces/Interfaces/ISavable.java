package com.teejaywurld.main.JavaBasics.InnerAbstractClassesAndInterfaces.Interfaces;

import java.util.List;

public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);
}
