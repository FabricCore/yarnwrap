package yarnwrap.client.font;
public class FreeTypeUtil { public net.minecraft.client.font.FreeTypeUtil wrapperContained; public FreeTypeUtil(net.minecraft.client.font.FreeTypeUtil wrapperContained) { this.wrapperContained = wrapperContained; }

// public long freeType() { return wrapperContained.freeType; }
public java.lang.Object LOCK() { return wrapperContained.LOCK; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public long initialize() { return wrapperContained.initialize(); }
// public java.lang.String getErrorMessage(int code) { return wrapperContained.getErrorMessage(code); }
public boolean checkError(int code,java.lang.String description) { return wrapperContained.checkError(code,description); }
public float getX(org.lwjgl.util.freetype.FT_Vector vec) { return wrapperContained.getX(vec); }
public org.lwjgl.util.freetype.FT_Vector set(org.lwjgl.util.freetype.FT_Vector vec,float x,float y) { return wrapperContained.set(vec,x,y); }
public void release() { wrapperContained.release(); }
public void checkFatalError(int code,java.lang.String description) { wrapperContained.checkFatalError(code,description); }

}