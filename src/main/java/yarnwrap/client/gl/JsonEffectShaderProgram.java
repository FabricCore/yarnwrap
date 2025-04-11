package yarnwrap.client.gl;
public class JsonEffectShaderProgram { public net.minecraft.client.gl.JsonEffectShaderProgram wrapperContained; public JsonEffectShaderProgram(net.minecraft.client.gl.JsonEffectShaderProgram wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List samplerNames() { return wrapperContained.samplerNames; }
// public void samplerNames(java.util.List value) { wrapperContained.samplerNames = value; }
// public java.util.List attributeNames() { return wrapperContained.attributeNames; }
// public void attributeNames(java.util.List value) { wrapperContained.attributeNames = value; }
// public int activeProgramGlRef() { return wrapperContained.activeProgramGlRef; }
// public void activeProgramGlRef(int value) { wrapperContained.activeProgramGlRef = value; }
// public java.util.List samplerLocations() { return wrapperContained.samplerLocations; }
// public void samplerLocations(java.util.List value) { wrapperContained.samplerLocations = value; }
// public java.util.List uniformLocations() { return wrapperContained.uniformLocations; }
// public void uniformLocations(java.util.List value) { wrapperContained.uniformLocations = value; }
// public yarnwrap.client.gl.EffectShaderStage vertexShader() { return new yarnwrap.client.gl.EffectShaderStage(wrapperContained.vertexShader); }
// public void vertexShader(yarnwrap.client.gl.EffectShaderStage value) { wrapperContained.vertexShader = value.wrapperContained; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.Map uniformByName() { return wrapperContained.uniformByName; }
// public void uniformByName(java.util.Map value) { wrapperContained.uniformByName = value; }
// public boolean uniformStateDirty() { return wrapperContained.uniformStateDirty; }
// public void uniformStateDirty(boolean value) { wrapperContained.uniformStateDirty = value; }
// public yarnwrap.client.gl.JsonEffectShaderProgram activeProgram() { return new yarnwrap.client.gl.JsonEffectShaderProgram(wrapperContained.activeProgram); }
// public void activeProgram(yarnwrap.client.gl.JsonEffectShaderProgram value) { wrapperContained.activeProgram = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.List uniformData() { return wrapperContained.uniformData; }
// public void uniformData(java.util.List value) { wrapperContained.uniformData = value; }
// public java.util.Map samplerBinds() { return wrapperContained.samplerBinds; }
// public void samplerBinds(java.util.Map value) { wrapperContained.samplerBinds = value; }
// public yarnwrap.client.gl.GlBlendState blendState() { return new yarnwrap.client.gl.GlBlendState(wrapperContained.blendState); }
// public void blendState(yarnwrap.client.gl.GlBlendState value) { wrapperContained.blendState = value.wrapperContained; }
// public java.util.List attributeLocations() { return wrapperContained.attributeLocations; }
// public void attributeLocations(java.util.List value) { wrapperContained.attributeLocations = value; }
// public yarnwrap.client.gl.EffectShaderStage fragmentShader() { return new yarnwrap.client.gl.EffectShaderStage(wrapperContained.fragmentShader); }
// public void fragmentShader(yarnwrap.client.gl.EffectShaderStage value) { wrapperContained.fragmentShader = value.wrapperContained; }
// public yarnwrap.client.gl.Uniform DEFAULT_UNIFORM() { return new yarnwrap.client.gl.Uniform(wrapperContained.DEFAULT_UNIFORM); }
// public void DEFAULT_UNIFORM(yarnwrap.client.gl.Uniform value) { wrapperContained.DEFAULT_UNIFORM = value.wrapperContained; }
// public int glRef() { return wrapperContained.glRef; }
// public void glRef(int value) { wrapperContained.glRef = value; }
// public java.lang.String PROGRAM_DIRECTORY() { return wrapperContained.PROGRAM_DIRECTORY; }
// public void PROGRAM_DIRECTORY(java.lang.String value) { wrapperContained.PROGRAM_DIRECTORY = value; }
// public void finalizeUniformsAndSamplers() { wrapperContained.finalizeUniformsAndSamplers(); }
// public void bindSampler(java.lang.String samplerName) { wrapperContained.bindSampler(samplerName); }
public yarnwrap.client.gl.GlUniform getUniformByName(java.lang.String name) { return new yarnwrap.client.gl.GlUniform(wrapperContained.getUniformByName(name)); }
// public void addUniform(com.google.gson.JsonElement json) { wrapperContained.addUniform(json); }
public void disable() { wrapperContained.disable(); }
public yarnwrap.client.gl.Uniform getUniformByNameOrDummy(java.lang.String name) { return new yarnwrap.client.gl.Uniform(wrapperContained.getUniformByNameOrDummy(name)); }
// public void addSampler(com.google.gson.JsonElement json) { wrapperContained.addSampler(json); }
public void enable() { wrapperContained.enable(); }
public yarnwrap.client.gl.GlBlendState deserializeBlendState(com.google.gson.JsonObject json) { return new yarnwrap.client.gl.GlBlendState(wrapperContained.deserializeBlendState(json)); }
// public yarnwrap.client.gl.EffectShaderStage loadEffect(yarnwrap.resource.ResourceFactory type,Object name) { return new yarnwrap.client.gl.EffectShaderStage(wrapperContained.loadEffect(type.wrapperContained,name)); }
public java.lang.String getName() { return wrapperContained.getName(); }

}