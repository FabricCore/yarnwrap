package yarnwrap.client.gl;
public class EffectShaderStage { public net.minecraft.client.gl.EffectShaderStage wrapperContained; public EffectShaderStage(net.minecraft.client.gl.EffectShaderStage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.GlImportProcessor LOADER() { return new yarnwrap.client.gl.GlImportProcessor(wrapperContained.LOADER); }
// public void LOADER(yarnwrap.client.gl.GlImportProcessor value) { wrapperContained.LOADER = value.wrapperContained; }
// public static yarnwrap.client.gl.GlImportProcessor LOADER() { return new yarnwrap.client.gl.GlImportProcessor(net.minecraft.client.gl.EffectShaderStage.LOADER); }
// public static void LOADER(yarnwrap.client.gl.GlImportProcessor value, ) { net.minecraft.client.gl.EffectShaderStage.LOADER = value.wrapperContained; }

// public int refCount() { return wrapperContained.refCount; }
// public void refCount(int value) { wrapperContained.refCount = value; }
// public static int refCount() { return net.minecraft.client.gl.EffectShaderStage.refCount; }
// public static void refCount(int value, ) { net.minecraft.client.gl.EffectShaderStage.refCount = value; }

// public EffectShaderStage(Object type,int glRef,java.lang.String name) { this.wrapperContained = new net.minecraft.client.gl.EffectShaderStage(type,glRef,name); }
public void attachTo(yarnwrap.client.gl.EffectShaderProgram program) { wrapperContained.attachTo(program.wrapperContained); }
// public static void attachTo(yarnwrap.client.gl.EffectShaderProgram program, ) { net.minecraft.client.gl.EffectShaderStage.attachTo(program.wrapperContained); }
// public yarnwrap.client.gl.EffectShaderStage createFromResource(Object type,java.lang.String name,java.io.InputStream stream,java.lang.String domain) { return new yarnwrap.client.gl.EffectShaderStage(wrapperContained.createFromResource(type,name,stream,domain)); }
// public static yarnwrap.client.gl.EffectShaderStage createFromResource(Object type,java.lang.String name,java.io.InputStream stream,java.lang.String domain, ) { return new yarnwrap.client.gl.EffectShaderStage(net.minecraft.client.gl.EffectShaderStage.createFromResource(type,name,stream,domain)); }

}