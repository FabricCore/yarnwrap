package yarnwrap.client.option;
public class Perspective { public net.minecraft.client.option.Perspective wrapperContained; public Perspective(net.minecraft.client.option.Perspective wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.option.Perspective[] VALUES() { return wrapperContained.VALUES; }
// public void VALUES(net.minecraft.client.option.Perspective[] value) { wrapperContained.VALUES = value; }
// public boolean firstPerson() { return wrapperContained.firstPerson; }
// public void firstPerson(boolean value) { wrapperContained.firstPerson = value; }
// public boolean frontView() { return wrapperContained.frontView; }
// public void frontView(boolean value) { wrapperContained.frontView = value; }
public boolean isFirstPerson() { return wrapperContained.isFirstPerson(); }
public boolean isFrontView() { return wrapperContained.isFrontView(); }
public yarnwrap.client.option.Perspective next() { return new yarnwrap.client.option.Perspective(wrapperContained.next()); }

}