package yarnwrap.entity.data;
public class TrackedData { public net.minecraft.entity.data.TrackedData wrapperContained; public TrackedData(net.minecraft.entity.data.TrackedData wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public yarnwrap.entity.data.TrackedDataHandler dataType() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.dataType); }
// public void dataType(yarnwrap.entity.data.TrackedDataHandler value) { wrapperContained.dataType = value.wrapperContained; }
// public int id() { return wrapperContained.id(); }
// public yarnwrap.entity.data.TrackedDataHandler dataType() { return new yarnwrap.entity.data.TrackedDataHandler(wrapperContained.dataType()); }

}