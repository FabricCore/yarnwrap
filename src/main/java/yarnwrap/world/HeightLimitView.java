package yarnwrap.world;
public class HeightLimitView { public net.minecraft.world.HeightLimitView wrapperContained; public HeightLimitView(net.minecraft.world.HeightLimitView wrapperContained) { this.wrapperContained = wrapperContained; }

public int getTopSectionCoord() { return wrapperContained.getTopSectionCoord(); }
// public static int getTopSectionCoord() { return net.minecraft.world.HeightLimitView.getTopSectionCoord(); }
public int getTopYInclusive() { return wrapperContained.getTopYInclusive(); }
// public static int getTopYInclusive() { return net.minecraft.world.HeightLimitView.getTopYInclusive(); }
public boolean isOutOfHeightLimit(int y) { return wrapperContained.isOutOfHeightLimit(y); }
// public static boolean isOutOfHeightLimit(int y, ) { return net.minecraft.world.HeightLimitView.isOutOfHeightLimit(y); }
public int getSectionIndex(int y) { return wrapperContained.getSectionIndex(y); }
// public static int getSectionIndex(int y, ) { return net.minecraft.world.HeightLimitView.getSectionIndex(y); }
public int sectionCoordToIndex(int coord) { return wrapperContained.sectionCoordToIndex(coord); }
// public static int sectionCoordToIndex(int coord, ) { return net.minecraft.world.HeightLimitView.sectionCoordToIndex(coord); }
public int sectionIndexToCoord(int index) { return wrapperContained.sectionIndexToCoord(index); }
// public static int sectionIndexToCoord(int index, ) { return net.minecraft.world.HeightLimitView.sectionIndexToCoord(index); }
public int getHeight() { return wrapperContained.getHeight(); }
// public static int getHeight() { return net.minecraft.world.HeightLimitView.getHeight(); }
public boolean isOutOfHeightLimit(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isOutOfHeightLimit(pos.wrapperContained); }
// public static boolean isOutOfHeightLimit(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.HeightLimitView.isOutOfHeightLimit(pos.wrapperContained); }
public int getBottomY() { return wrapperContained.getBottomY(); }
// public static int getBottomY() { return net.minecraft.world.HeightLimitView.getBottomY(); }
public int countVerticalSections() { return wrapperContained.countVerticalSections(); }
// public static int countVerticalSections() { return net.minecraft.world.HeightLimitView.countVerticalSections(); }
public int getBottomSectionCoord() { return wrapperContained.getBottomSectionCoord(); }
// public static int getBottomSectionCoord() { return net.minecraft.world.HeightLimitView.getBottomSectionCoord(); }
// public yarnwrap.world.HeightLimitView create(int bottomY,int height) { return new yarnwrap.world.HeightLimitView(wrapperContained.create(bottomY,height)); }
// public static yarnwrap.world.HeightLimitView create(int bottomY,int height, ) { return new yarnwrap.world.HeightLimitView(net.minecraft.world.HeightLimitView.create(bottomY,height)); }
public boolean isInHeightLimit(int y) { return wrapperContained.isInHeightLimit(y); }
// public static boolean isInHeightLimit(int y, ) { return net.minecraft.world.HeightLimitView.isInHeightLimit(y); }

}