package yarnwrap.test;
public class GameTestBatch { public net.minecraft.test.GameTestBatch wrapperContained; public GameTestBatch(net.minecraft.test.GameTestBatch wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public java.util.Collection states() { return wrapperContained.states; }
// public void states(java.util.Collection value) { wrapperContained.states = value; }
public java.lang.String DEFAULT_BATCH() { return wrapperContained.DEFAULT_BATCH; }
// public void DEFAULT_BATCH(java.lang.String value) { wrapperContained.DEFAULT_BATCH = value; }
// public java.lang.String id() { return wrapperContained.id(); }
// public java.util.Collection states() { return wrapperContained.states(); }

}