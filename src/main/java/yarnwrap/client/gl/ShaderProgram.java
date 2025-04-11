package yarnwrap.client.gl;
public class ShaderProgram { public net.minecraft.client.gl.ShaderProgram wrapperContained; public ShaderProgram(net.minecraft.client.gl.ShaderProgram wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.ShaderStage vertexShader() { return new yarnwrap.client.gl.ShaderStage(wrapperContained.vertexShader); }
// public void vertexShader(yarnwrap.client.gl.ShaderStage value) { wrapperContained.vertexShader = value.wrapperContained; }
// public yarnwrap.client.gl.ShaderStage fragmentShader() { return new yarnwrap.client.gl.ShaderStage(wrapperContained.fragmentShader); }
// public void fragmentShader(yarnwrap.client.gl.ShaderStage value) { wrapperContained.fragmentShader = value.wrapperContained; }
// public yarnwrap.client.render.VertexFormat format() { return new yarnwrap.client.render.VertexFormat(wrapperContained.format); }
// public void format(yarnwrap.client.render.VertexFormat value) { wrapperContained.format = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform modelViewMat() { return new yarnwrap.client.gl.GlUniform(wrapperContained.modelViewMat); }
// public void modelViewMat(yarnwrap.client.gl.GlUniform value) { wrapperContained.modelViewMat = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform projectionMat() { return new yarnwrap.client.gl.GlUniform(wrapperContained.projectionMat); }
// public void projectionMat(yarnwrap.client.gl.GlUniform value) { wrapperContained.projectionMat = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform textureMat() { return new yarnwrap.client.gl.GlUniform(wrapperContained.textureMat); }
// public void textureMat(yarnwrap.client.gl.GlUniform value) { wrapperContained.textureMat = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform screenSize() { return new yarnwrap.client.gl.GlUniform(wrapperContained.screenSize); }
// public void screenSize(yarnwrap.client.gl.GlUniform value) { wrapperContained.screenSize = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform colorModulator() { return new yarnwrap.client.gl.GlUniform(wrapperContained.colorModulator); }
// public void colorModulator(yarnwrap.client.gl.GlUniform value) { wrapperContained.colorModulator = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform light0Direction() { return new yarnwrap.client.gl.GlUniform(wrapperContained.light0Direction); }
// public void light0Direction(yarnwrap.client.gl.GlUniform value) { wrapperContained.light0Direction = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform light1Direction() { return new yarnwrap.client.gl.GlUniform(wrapperContained.light1Direction); }
// public void light1Direction(yarnwrap.client.gl.GlUniform value) { wrapperContained.light1Direction = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform fogStart() { return new yarnwrap.client.gl.GlUniform(wrapperContained.fogStart); }
// public void fogStart(yarnwrap.client.gl.GlUniform value) { wrapperContained.fogStart = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform fogEnd() { return new yarnwrap.client.gl.GlUniform(wrapperContained.fogEnd); }
// public void fogEnd(yarnwrap.client.gl.GlUniform value) { wrapperContained.fogEnd = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform fogColor() { return new yarnwrap.client.gl.GlUniform(wrapperContained.fogColor); }
// public void fogColor(yarnwrap.client.gl.GlUniform value) { wrapperContained.fogColor = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform lineWidth() { return new yarnwrap.client.gl.GlUniform(wrapperContained.lineWidth); }
// public void lineWidth(yarnwrap.client.gl.GlUniform value) { wrapperContained.lineWidth = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform gameTime() { return new yarnwrap.client.gl.GlUniform(wrapperContained.gameTime); }
// public void gameTime(yarnwrap.client.gl.GlUniform value) { wrapperContained.gameTime = value.wrapperContained; }
public yarnwrap.client.gl.GlUniform chunkOffset() { return new yarnwrap.client.gl.GlUniform(wrapperContained.chunkOffset); }
// public void chunkOffset(yarnwrap.client.gl.GlUniform value) { wrapperContained.chunkOffset = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.client.gl.Uniform DEFAULT_UNIFORM() { return new yarnwrap.client.gl.Uniform(wrapperContained.DEFAULT_UNIFORM); }
// public void DEFAULT_UNIFORM(yarnwrap.client.gl.Uniform value) { wrapperContained.DEFAULT_UNIFORM = value.wrapperContained; }
// public yarnwrap.client.gl.ShaderProgram activeProgram() { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.activeProgram); }
// public void activeProgram(yarnwrap.client.gl.ShaderProgram value) { wrapperContained.activeProgram = value.wrapperContained; }
// public int activeProgramGlRef() { return wrapperContained.activeProgramGlRef; }
// public void activeProgramGlRef(int value) { wrapperContained.activeProgramGlRef = value; }
// public java.util.Map samplers() { return wrapperContained.samplers; }
// public void samplers(java.util.Map value) { wrapperContained.samplers = value; }
// public java.util.List samplerNames() { return wrapperContained.samplerNames; }
// public void samplerNames(java.util.List value) { wrapperContained.samplerNames = value; }
// public java.util.List loadedSamplerIds() { return wrapperContained.loadedSamplerIds; }
// public void loadedSamplerIds(java.util.List value) { wrapperContained.loadedSamplerIds = value; }
// public java.util.List uniforms() { return wrapperContained.uniforms; }
// public void uniforms(java.util.List value) { wrapperContained.uniforms = value; }
// public java.util.List loadedUniformIds() { return wrapperContained.loadedUniformIds; }
// public void loadedUniformIds(java.util.List value) { wrapperContained.loadedUniformIds = value; }
// public java.util.Map loadedUniforms() { return wrapperContained.loadedUniforms; }
// public void loadedUniforms(java.util.Map value) { wrapperContained.loadedUniforms = value; }
// public int glRef() { return wrapperContained.glRef; }
// public void glRef(int value) { wrapperContained.glRef = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public boolean dirty() { return wrapperContained.dirty; }
// public void dirty(boolean value) { wrapperContained.dirty = value; }
public java.lang.String SHADERS_DIRECTORY() { return wrapperContained.SHADERS_DIRECTORY; }
// public void SHADERS_DIRECTORY(java.lang.String value) { wrapperContained.SHADERS_DIRECTORY = value; }
// public java.lang.String INCLUDE_DIRECTORY() { return wrapperContained.INCLUDE_DIRECTORY; }
// public void INCLUDE_DIRECTORY(java.lang.String value) { wrapperContained.INCLUDE_DIRECTORY = value; }
public yarnwrap.client.gl.GlUniform fogShape() { return new yarnwrap.client.gl.GlUniform(wrapperContained.fogShape); }
// public void fogShape(yarnwrap.client.gl.GlUniform value) { wrapperContained.fogShape = value.wrapperContained; }
// public java.lang.String CORE_DIRECTORY() { return wrapperContained.CORE_DIRECTORY; }
// public void CORE_DIRECTORY(java.lang.String value) { wrapperContained.CORE_DIRECTORY = value; }
public yarnwrap.client.gl.GlUniform glintAlpha() { return new yarnwrap.client.gl.GlUniform(wrapperContained.glintAlpha); }
// public void glintAlpha(yarnwrap.client.gl.GlUniform value) { wrapperContained.glintAlpha = value.wrapperContained; }
// public ShaderProgram(yarnwrap.resource.ResourceFactory factory,java.lang.String name,yarnwrap.client.render.VertexFormat format) { this.wrapperContained = new net.minecraft.client.gl.ShaderProgram(factory.wrapperContained,name,format.wrapperContained); }
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