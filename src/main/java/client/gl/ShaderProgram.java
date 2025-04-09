package yarnwrap.client.gl;
public class ShaderProgram { public net.minecraft.client.gl.ShaderProgram wrapperContained; public ShaderProgram(net.minecraft.client.gl.ShaderProgram wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.ShaderStage vertexShader() { return new yarnwrap.client.gl.ShaderStage(wrapperContained.vertexShader); }
// public yarnwrap.client.gl.ShaderStage fragmentShader() { return new yarnwrap.client.gl.ShaderStage(wrapperContained.fragmentShader); }
// public yarnwrap.client.render.VertexFormat format() { return new yarnwrap.client.render.VertexFormat(wrapperContained.format); }
public yarnwrap.client.gl.GlUniform modelViewMat() { return new yarnwrap.client.gl.GlUniform(wrapperContained.modelViewMat); }
public yarnwrap.client.gl.GlUniform projectionMat() { return new yarnwrap.client.gl.GlUniform(wrapperContained.projectionMat); }
public yarnwrap.client.gl.GlUniform textureMat() { return new yarnwrap.client.gl.GlUniform(wrapperContained.textureMat); }
public yarnwrap.client.gl.GlUniform screenSize() { return new yarnwrap.client.gl.GlUniform(wrapperContained.screenSize); }
public yarnwrap.client.gl.GlUniform colorModulator() { return new yarnwrap.client.gl.GlUniform(wrapperContained.colorModulator); }
public yarnwrap.client.gl.GlUniform light0Direction() { return new yarnwrap.client.gl.GlUniform(wrapperContained.light0Direction); }
public yarnwrap.client.gl.GlUniform light1Direction() { return new yarnwrap.client.gl.GlUniform(wrapperContained.light1Direction); }
public yarnwrap.client.gl.GlUniform fogStart() { return new yarnwrap.client.gl.GlUniform(wrapperContained.fogStart); }
public yarnwrap.client.gl.GlUniform fogEnd() { return new yarnwrap.client.gl.GlUniform(wrapperContained.fogEnd); }
public yarnwrap.client.gl.GlUniform fogColor() { return new yarnwrap.client.gl.GlUniform(wrapperContained.fogColor); }
public yarnwrap.client.gl.GlUniform lineWidth() { return new yarnwrap.client.gl.GlUniform(wrapperContained.lineWidth); }
public yarnwrap.client.gl.GlUniform gameTime() { return new yarnwrap.client.gl.GlUniform(wrapperContained.gameTime); }
public yarnwrap.client.gl.GlUniform chunkOffset() { return new yarnwrap.client.gl.GlUniform(wrapperContained.chunkOffset); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.client.gl.Uniform DEFAULT_UNIFORM() { return new yarnwrap.client.gl.Uniform(wrapperContained.DEFAULT_UNIFORM); }
// public yarnwrap.client.gl.ShaderProgram activeProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.activeProgram); }
// public int activeProgramGlRef() { return wrapperContained.activeProgramGlRef; }
// public java.util.Map samplers() { return wrapperContained.samplers; }
// public java.util.List samplerNames() { return wrapperContained.samplerNames; }
// public java.util.List loadedSamplerIds() { return wrapperContained.loadedSamplerIds; }
// public java.util.List uniforms() { return wrapperContained.uniforms; }
// public java.util.List loadedUniformIds() { return wrapperContained.loadedUniformIds; }
// public java.util.Map loadedUniforms() { return wrapperContained.loadedUniforms; }
// public int glRef() { return wrapperContained.glRef; }
// public java.lang.String name() { return wrapperContained.name; }
// public boolean dirty() { return wrapperContained.dirty; }
public java.lang.String SHADERS_DIRECTORY() { return wrapperContained.SHADERS_DIRECTORY; }
// public java.lang.String INCLUDE_DIRECTORY() { return wrapperContained.INCLUDE_DIRECTORY; }
public yarnwrap.client.gl.GlUniform fogShape() { return new yarnwrap.client.gl.GlUniform(wrapperContained.fogShape); }
// public java.lang.String CORE_DIRECTORY() { return wrapperContained.CORE_DIRECTORY; }
public yarnwrap.client.gl.GlUniform glintAlpha() { return new yarnwrap.client.gl.GlUniform(wrapperContained.glintAlpha); }
// public yarnwrap.client.gl.ShaderStage loadShader(yarnwrap.resource.ResourceFactory factory,Object type,java.lang.String name) { return new yarnwrap.client.gl.ShaderStage(wrapperContained.loadShader(factory.wrapperContained,type,name)); }
// public void readSampler(com.google.gson.JsonElement json) { wrapperContained.readSampler(json); }
public yarnwrap.client.gl.GlUniform getUniform(java.lang.String name) { return new yarnwrap.client.gl.GlUniform(wrapperContained.getUniform(name)); }
public void addSampler(java.lang.String name,java.lang.Object sampler) { wrapperContained.addSampler(name,sampler); }
// public void addUniform(com.google.gson.JsonElement json) { wrapperContained.addUniform(json); }
public void unbind() { wrapperContained.unbind(); }
public void bind() { wrapperContained.bind(); }
// public void loadReferences() { wrapperContained.loadReferences(); }
public yarnwrap.client.gl.Uniform getUniformOrDefault(java.lang.String name) { return new yarnwrap.client.gl.Uniform(wrapperContained.getUniformOrDefault(name)); }
public yarnwrap.client.render.VertexFormat getFormat() { return new yarnwrap.client.render.VertexFormat(wrapperContained.getFormat()); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public void initializeUniforms(Object drawMode,org.joml.Matrix4f viewMatrix,org.joml.Matrix4f projectionMatrix,yarnwrap.client.util.Window window) { wrapperContained.initializeUniforms(drawMode,viewMatrix,projectionMatrix,window.wrapperContained); }

}