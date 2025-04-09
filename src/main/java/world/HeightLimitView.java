package yarnwrap.world;
public class HeightLimitView { public net.minecraft.world.HeightLimitView wrapperContained; public HeightLimitView(net.minecraft.world.HeightLimitView wrapperContained) { this.wrapperContained = wrapperContained; }

public int getTopSectionCoord() { return wrapperContained.getTopSectionCoord(); }
public int getTopY() { return wrapperContained.getTopY(); }
public boolean isOutOfHeightLimit(int y) { return wrapperContained.isOutOfHeightLimit(y); }
public int getSectionIndex(int y) { return wrapperContained.getSectionIndex(y); }
public int sectionCoordToIndex(int coord) { return wrapperContained.sectionCoordToIndex(coord); }
public int sectionIndexToCoord(int index) { return wrapperContained.sectionIndexToCoord(index); }
public int getHeight() { return wrapperContained.getHeight(); }
public boolean isOutOfHeightLimit(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isOutOfHeightLimit(pos.wrapperContained); }
public int getBottomY() { return wrapperContained.getBottomY(); }
public int countVerticalSections() { return wrapperContained.countVerticalSections(); }
public int getBottomSectionCoord() { return wrapperContained.getBottomSectionCoord(); }
// public yarnwrap.world.HeightLimitView create(int bottomY,int height) { return new yarnwrap.world.HeightLimitView(wrapperContained.create(bottomY,height)); }

}