package yarnwrap;
public class SaveVersion { public net.minecraft.SaveVersion wrapperContained; public SaveVersion(net.minecraft.SaveVersion wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String MAIN_SERIES() { return wrapperContained.MAIN_SERIES; }
// public int id() { return wrapperContained.id; }
// public java.lang.String series() { return wrapperContained.series; }
public boolean isNotMainSeries() { return wrapperContained.isNotMainSeries(); }
public java.lang.String getSeries() { return wrapperContained.getSeries(); }
public boolean isAvailableTo(yarnwrap.SaveVersion other) { return wrapperContained.isAvailableTo(other.wrapperContained); }
public int getId() { return wrapperContained.getId(); }

}