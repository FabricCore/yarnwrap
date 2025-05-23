package yarnwrap.client.option;
public class NarratorMode { public net.minecraft.client.option.NarratorMode wrapperContained; public NarratorMode(net.minecraft.client.option.NarratorMode wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
// public static java.util.function.IntFunction BY_ID() { return net.minecraft.client.option.NarratorMode.BY_ID; }
// public static void BY_ID(java.util.function.IntFunction value, ) { net.minecraft.client.option.NarratorMode.BY_ID = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.client.option.NarratorMode.id; }
// public static void id(int value, ) { net.minecraft.client.option.NarratorMode.id = value; }

// public yarnwrap.text.Text name() { return new yarnwrap.text.Text(wrapperContained.name); }
// public void name(yarnwrap.text.Text value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.text.Text name() { return new yarnwrap.text.Text(net.minecraft.client.option.NarratorMode.name); }
// public static void name(yarnwrap.text.Text value, ) { net.minecraft.client.option.NarratorMode.name = value.wrapperContained; }

// // public NarratorMode(java.lang.String id,int name) { this.wrapperContained = new net.minecraft.client.option.NarratorMode(id,name); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.client.option.NarratorMode.getId(); }
// public yarnwrap.client.option.NarratorMode byId(int id) { return new yarnwrap.client.option.NarratorMode(wrapperContained.byId(id)); }
// public static yarnwrap.client.option.NarratorMode byId(int id, ) { return new yarnwrap.client.option.NarratorMode(net.minecraft.client.option.NarratorMode.byId(id)); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.client.option.NarratorMode.getName()); }
public boolean shouldNarrateChat() { return wrapperContained.shouldNarrateChat(); }
// public static boolean shouldNarrateChat() { return net.minecraft.client.option.NarratorMode.shouldNarrateChat(); }
public boolean shouldNarrateSystem() { return wrapperContained.shouldNarrateSystem(); }
// public static boolean shouldNarrateSystem() { return net.minecraft.client.option.NarratorMode.shouldNarrateSystem(); }
// public boolean shouldNarrate() { return wrapperContained.shouldNarrate(); }
// public static boolean shouldNarrate() { return net.minecraft.client.option.NarratorMode.shouldNarrate(); }

}