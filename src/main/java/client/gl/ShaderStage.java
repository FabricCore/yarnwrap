package yarnwrap.client.gl;
public class ShaderStage { public net.minecraft.client.gl.ShaderStage wrapperContained; public ShaderStage(net.minecraft.client.gl.ShaderStage wrapperContained) { this.wrapperContained = wrapperContained; }

// public int glRef() { return wrapperContained.glRef; }
// public Object type() { return wrapperContained.type; }
// public java.lang.String name() { return wrapperContained.name; }
// public int MAX_INFO_LOG_LENGTH() { return wrapperContained.MAX_INFO_LOG_LENGTH; }
public java.lang.String getName() { return wrapperContained.getName(); }
public void attachTo(yarnwrap.client.gl.ShaderProgramSetupView program) { wrapperContained.attachTo(program.wrapperContained); }
public void release() { wrapperContained.release(); }
// public yarnwrap.client.gl.ShaderStage createFromResource(Object type,java.lang.String name,java.io.InputStream stream,java.lang.String domain,yarnwrap.client.gl.GlImportProcessor loader) { return new yarnwrap.client.gl.ShaderStage(wrapperContained.createFromResource(type,name,stream,domain,loader.wrapperContained)); }
// public int load(Object type,java.lang.String name,java.io.InputStream stream,java.lang.String domain,yarnwrap.client.gl.GlImportProcessor loader) { return wrapperContained.load(type,name,stream,domain,loader.wrapperContained); }
// public int getGlRef() { return wrapperContained.getGlRef(); }

}