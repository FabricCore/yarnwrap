package yarnwrap;
public class SaveVersion { public net.minecraft.SaveVersion wrapperContained; public SaveVersion(net.minecraft.SaveVersion wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String MAIN_SERIES() { return wrapperContained.MAIN_SERIES; }
// public void MAIN_SERIES(java.lang.String value) { wrapperContained.MAIN_SERIES = value; }
public static java.lang.String MAIN_SERIES() { return net.minecraft.SaveVersion.MAIN_SERIES; }
// public static void MAIN_SERIES(java.lang.String value, ) { net.minecraft.SaveVersion.MAIN_SERIES = value; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.SaveVersion.id; }
// public static void id(int value, ) { net.minecraft.SaveVersion.id = value; }

// public java.lang.String series() { return wrapperContained.series; }
// public void series(java.lang.String value) { wrapperContained.series = value; }
// public static java.lang.String series() { return net.minecraft.SaveVersion.series; }
// public static void series(java.lang.String value, ) { net.minecraft.SaveVersion.series = value; }

public SaveVersion(int id) { this.wrapperContained = new net.minecraft.SaveVersion(id); }
public SaveVersion(int id,java.lang.String series) { this.wrapperContained = new net.minecraft.SaveVersion(id,series); }
public boolean isNotMainSeries() { return wrapperContained.isNotMainSeries(); }
// public static boolean isNotMainSeries() { return net.minecraft.SaveVersion.isNotMainSeries(); }
public java.lang.String getSeries() { return wrapperContained.getSeries(); }
// public static java.lang.String getSeries() { return net.minecraft.SaveVersion.getSeries(); }
public boolean isAvailableTo(yarnwrap.SaveVersion other) { return wrapperContained.isAvailableTo(other.wrapperContained); }
// public static boolean isAvailableTo(yarnwrap.SaveVersion other, ) { return net.minecraft.SaveVersion.isAvailableTo(other.wrapperContained); }
public int getId() { return wrapperContained.getId(); }
// public static int getId() { return net.minecraft.SaveVersion.getId(); }

}