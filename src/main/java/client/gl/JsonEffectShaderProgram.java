package yarnwrap.client.gl;
public class JsonEffectShaderProgram { public net.minecraft.client.gl.JsonEffectShaderProgram wrapperContained; public JsonEffectShaderProgram(net.minecraft.client.gl.JsonEffectShaderProgram wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List samplerNames() { return wrapperContained.samplerNames; }
// public java.util.List attributeNames() { return wrapperContained.attributeNames; }
// public int activeProgramGlRef() { return wrapperContained.activeProgramGlRef; }
// public java.util.List samplerLocations() { return wrapperContained.samplerLocations; }
// public java.util.List uniformLocations() { return wrapperContained.uniformLocations; }
// public yarnwrap.client.gl.EffectShaderStage vertexShader() { return new yarnwrap.client.gl.EffectShaderStage(wrapperContained.vertexShader); }
// public java.lang.String name() { return wrapperContained.name; }
// public java.util.Map uniformByName() { return wrapperContained.uniformByName; }
// public boolean uniformStateDirty() { return wrapperContained.uniformStateDirty; }
// public yarnwrap.client.gl.JsonEffectShaderProgram activeProgram() { return new yarnwrap.client.gl.JsonEffectShaderProgram(wrapperContained.activeProgram); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.List uniformData() { return wrapperContained.uniformData; }
// public java.util.Map samplerBinds() { return wrapperContained.samplerBinds; }
// public yarnwrap.client.gl.GlBlendState blendState() { return new yarnwrap.client.gl.GlBlendState(wrapperContained.blendState); }
// public java.util.List attributeLocations() { return wrapperContained.attributeLocations; }
// public yarnwrap.client.gl.EffectShaderStage fragmentShader() { return new yarnwrap.client.gl.EffectShaderStage(wrapperContained.fragmentShader); }
// public yarnwrap.client.gl.Uniform DEFAULT_UNIFORM() { return new yarnwrap.client.gl.Uniform(wrapperContained.DEFAULT_UNIFORM); }
// public int glRef() { return wrapperContained.glRef; }
// public java.lang.String PROGRAM_DIRECTORY() { return wrapperContained.PROGRAM_DIRECTORY; }
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