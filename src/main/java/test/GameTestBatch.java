package yarnwrap.test;
public class GameTestBatch { public net.minecraft.test.GameTestBatch wrapperContained; public GameTestBatch(net.minecraft.test.GameTestBatch wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public java.util.Collection states() { return wrapperContained.states; }
public java.lang.String DEFAULT_BATCH() { return wrapperContained.DEFAULT_BATCH; }
// public java.lang.String id() { return wrapperContained.id(); }
// public java.util.Collection states() { return wrapperContained.states(); }

}