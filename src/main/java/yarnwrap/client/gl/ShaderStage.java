package yarnwrap.client.gl;
public class ShaderStage { public net.minecraft.client.gl.ShaderStage wrapperContained; public ShaderStage(net.minecraft.client.gl.ShaderStage wrapperContained) { this.wrapperContained = wrapperContained; }

// public int glRef() { return wrapperContained.glRef; }
// public void glRef(int value) { wrapperContained.glRef = value; }
// public static int glRef() { return net.minecraft.client.gl.ShaderStage.glRef; }
// public static void glRef(int value, ) { net.minecraft.client.gl.ShaderStage.glRef = value; }

// public Object type() { return wrapperContained.type; }
// // public void type(Object value) { wrapperContained.type = value; }
// // public static Object type() { return net.minecraft.client.gl.ShaderStage.type; }
// // public static void type(Object value, ) { net.minecraft.client.gl.ShaderStage.type = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.gl.ShaderStage.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.gl.ShaderStage.name = value; }

// public int MAX_INFO_LOG_LENGTH() { return wrapperContained.MAX_INFO_LOG_LENGTH; }
// public void MAX_INFO_LOG_LENGTH(int value) { wrapperContained.MAX_INFO_LOG_LENGTH = value; }
// public static int MAX_INFO_LOG_LENGTH() { return net.minecraft.client.gl.ShaderStage.MAX_INFO_LOG_LENGTH; }
// public static void MAX_INFO_LOG_LENGTH(int value, ) { net.minecraft.client.gl.ShaderStage.MAX_INFO_LOG_LENGTH = value; }

// public ShaderStage(Object type,int glRef,java.lang.String name) { this.wrapperContained = new net.minecraft.client.gl.ShaderStage(type,glRef,name); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.client.gl.ShaderStage.getName(); }
public void attachTo(yarnwrap.client.gl.ShaderProgramSetupView program) { wrapperContained.attachTo(program.wrapperContained); }
// public static void attachTo(yarnwrap.client.gl.ShaderProgramSetupView program, ) { net.minecraft.client.gl.ShaderStage.attachTo(program.wrapperContained); }
public void release() { wrapperContained.release(); }
// public static void release() { net.minecraft.client.gl.ShaderStage.release(); }
// public yarnwrap.client.gl.ShaderStage createFromResource(Object type,java.lang.String name,java.io.InputStream stream,java.lang.String domain,yarnwrap.client.gl.GlImportProcessor loader) { return new yarnwrap.client.gl.ShaderStage(wrapperContained.createFromResource(type,name,stream,domain,loader.wrapperContained)); }
// public static yarnwrap.client.gl.ShaderStage createFromResource(Object type,java.lang.String name,java.io.InputStream stream,java.lang.String domain,yarnwrap.client.gl.GlImportProcessor loader, ) { return new yarnwrap.client.gl.ShaderStage(net.minecraft.client.gl.ShaderStage.createFromResource(type,name,stream,domain,loader.wrapperContained)); }
// public int load(Object type,java.lang.String name,java.io.InputStream stream,java.lang.String domain,yarnwrap.client.gl.GlImportProcessor loader) { return wrapperContained.load(type,name,stream,domain,loader.wrapperContained); }
// public static int load(Object type,java.lang.String name,java.io.InputStream stream,java.lang.String domain,yarnwrap.client.gl.GlImportProcessor loader, ) { return net.minecraft.client.gl.ShaderStage.load(type,name,stream,domain,loader.wrapperContained); }
// public int getGlRef() { return wrapperContained.getGlRef(); }
// public static int getGlRef() { return net.minecraft.client.gl.ShaderStage.getGlRef(); }

}