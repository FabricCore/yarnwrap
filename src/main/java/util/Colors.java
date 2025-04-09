package yarnwrap.util;
public class Colors { public net.minecraft.util.Colors wrapperContained; public Colors(net.minecraft.util.Colors wrapperContained) { this.wrapperContained = wrapperContained; }

public int RED() { return wrapperContained.RED; }
public int WHITE() { return wrapperContained.WHITE; }
public int BLACK() { return wrapperContained.BLACK; }
public int GRAY() { return wrapperContained.GRAY; }
public int LIGHT_GRAY() { return wrapperContained.LIGHT_GRAY; }
public int LIGHT_RED() { return wrapperContained.LIGHT_RED; }
public int YELLOW() { return wrapperContained.YELLOW; }
public int LIGHT_YELLOW() { return wrapperContained.LIGHT_YELLOW; }
public int ALTERNATE_WHITE() { return wrapperContained.ALTERNATE_WHITE; }
public int GREEN() { return wrapperContained.GREEN; }
public int BLUE() { return wrapperContained.BLUE; }

}