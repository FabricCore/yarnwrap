package yarnwrap.client.option;
public class Perspective { public net.minecraft.client.option.Perspective wrapperContained; public Perspective(net.minecraft.client.option.Perspective wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.option.Perspective[] VALUES() { return wrapperContained.VALUES; }
// public void VALUES(net.minecraft.client.option.Perspective[] value) { wrapperContained.VALUES = value; }
// public static net.minecraft.client.option.Perspective[] VALUES() { return net.minecraft.client.option.Perspective.VALUES; }
// public static void VALUES(net.minecraft.client.option.Perspective[] value, ) { net.minecraft.client.option.Perspective.VALUES = value; }

// public boolean firstPerson() { return wrapperContained.firstPerson; }
// public void firstPerson(boolean value) { wrapperContained.firstPerson = value; }
// public static boolean firstPerson() { return net.minecraft.client.option.Perspective.firstPerson; }
// public static void firstPerson(boolean value, ) { net.minecraft.client.option.Perspective.firstPerson = value; }

// public boolean frontView() { return wrapperContained.frontView; }
// public void frontView(boolean value) { wrapperContained.frontView = value; }
// public static boolean frontView() { return net.minecraft.client.option.Perspective.frontView; }
// public static void frontView(boolean value, ) { net.minecraft.client.option.Perspective.frontView = value; }

// // public Perspective(java.lang.String firstPerson,int frontView) { this.wrapperContained = new net.minecraft.client.option.Perspective(firstPerson,frontView); }
public boolean isFirstPerson() { return wrapperContained.isFirstPerson(); }
// public static boolean isFirstPerson() { return net.minecraft.client.option.Perspective.isFirstPerson(); }
public boolean isFrontView() { return wrapperContained.isFrontView(); }
// public static boolean isFrontView() { return net.minecraft.client.option.Perspective.isFrontView(); }
public yarnwrap.client.option.Perspective next() { return new yarnwrap.client.option.Perspective(wrapperContained.next()); }
// public static yarnwrap.client.option.Perspective next() { return new yarnwrap.client.option.Perspective(net.minecraft.client.option.Perspective.next()); }

}