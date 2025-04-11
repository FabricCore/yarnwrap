package yarnwrap.structure;
public class PostPlacementProcessor { public net.minecraft.structure.PostPlacementProcessor wrapperContained; public PostPlacementProcessor(net.minecraft.structure.PostPlacementProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.PostPlacementProcessor EMPTY() { return new yarnwrap.structure.PostPlacementProcessor(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.structure.PostPlacementProcessor value) { wrapperContained.EMPTY = value.wrapperContained; }

}