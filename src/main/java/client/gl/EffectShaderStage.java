package yarnwrap.client.gl;
public class EffectShaderStage { public net.minecraft.client.gl.EffectShaderStage wrapperContained; public EffectShaderStage(net.minecraft.client.gl.EffectShaderStage wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.GlImportProcessor LOADER() { return new yarnwrap.client.gl.GlImportProcessor(wrapperContained.LOADER); }
// public int refCount() { return wrapperContained.refCount; }
public void attachTo(yarnwrap.client.gl.EffectShaderProgram program) { wrapperContained.attachTo(program.wrapperContained); }
// public yarnwrap.client.gl.EffectShaderStage createFromResource(Object type,java.lang.String name,java.io.InputStream stream,java.lang.String domain) { return new yarnwrap.client.gl.EffectShaderStage(wrapperContained.createFromResource(type,name,stream,domain)); }

}