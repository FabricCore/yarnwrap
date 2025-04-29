package yarnwrap.entity.data;
public class TrackedData { public net.minecraft.entity.data.TrackedData wrapperContained; public TrackedData(net.minecraft.entity.data.TrackedData wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.entity.data.TrackedData.id; }
// public static void id(int value, ) { net.minecraft.entity.data.TrackedData.id = value; }

// public yarnwrap.entity.data.TrackedDataHandler dataType() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.dataType); }
// public void dataType(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.dataType = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedDataHandler dataType() { return new yarnwrap.entity.data.TrackedDataHandler(net.minecraft.entity.data.TrackedData.dataType); }
// public static void dataType(yarnwrap.entity.data.TrackedDataHandler value, ) { net.minecraft.entity.data.TrackedData.dataType = value.wrapperContained; }

public TrackedData(int id,yarnwrap.entity.data.TrackedDataHandler dataType) { this.wrapperContained = new net.minecraft.entity.data.TrackedData(id,dataType.wrapperContained); }
// public int id() { return wrapperContained.id(); }
// // public static int id() { return net.minecraft.entity.data.TrackedData.id(); }
// public yarnwrap.entity.data.TrackedDataHandler dataType() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.dataType()); }
// // public static yarnwrap.entity.data.TrackedDataHandler dataType() { return new yarnwrap.entity.data.TrackedDataHandler(net.minecraft.entity.data.TrackedData.dataType()); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.entity.data.TrackedData.equals(o); }

}