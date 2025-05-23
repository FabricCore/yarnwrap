package yarnwrap.client.gl;
public class ShaderProgram { public net.minecraft.client.gl.ShaderProgram wrapperContained; public ShaderProgram(net.minecraft.client.gl.ShaderProgram wrapperContained) { this.wrapperContained = wrapperContained; }

// public int glRef() { return wrapperContained.glRef; }
// public void glRef(int value) { wrapperContained.glRef = value; }
// public static int glRef() { return net.minecraft.client.gl.ShaderProgram.glRef; }
// public static void glRef(int value, ) { net.minecraft.client.gl.ShaderProgram.glRef = value; }

// public java.util.Map uniformsByName() { return wrapperContained.uniformsByName; }
// public void uniformsByName(java.util.Map value) { wrapperContained.uniformsByName = value; }
// public static java.util.Map uniformsByName() { return net.minecraft.client.gl.ShaderProgram.uniformsByName; }
// public static void uniformsByName(java.util.Map value, ) { net.minecraft.client.gl.ShaderProgram.uniformsByName = value; }

// public java.util.Set PREDEFINED_UNIFORMS() { return wrapperContained.PREDEFINED_UNIFORMS; }
// public void PREDEFINED_UNIFORMS(java.util.Set value) { wrapperContained.PREDEFINED_UNIFORMS = value; }
public static java.util.Set PREDEFINED_UNIFORMS() { return net.minecraft.client.gl.ShaderProgram.PREDEFINED_UNIFORMS; }
// public static void PREDEFINED_UNIFORMS(java.util.Set value, ) { net.minecraft.client.gl.ShaderProgram.PREDEFINED_UNIFORMS = value; }

// public java.lang.String debugLabel() { return wrapperContained.debugLabel; }
// public void debugLabel(java.lang.String value) { wrapperContained.debugLabel = value; }
// public static java.lang.String debugLabel() { return net.minecraft.client.gl.ShaderProgram.debugLabel; }
// public static void debugLabel(java.lang.String value, ) { net.minecraft.client.gl.ShaderProgram.debugLabel = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gl.ShaderProgram.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gl.ShaderProgram.LOGGER = value; }

// public ShaderProgram(int glRef,java.lang.String debugLabel) { this.wrapperContained = new net.minecraft.client.gl.ShaderProgram(glRef,debugLabel); }
public int getGlRef() { return wrapperContained.getGlRef(); }
// public static int getGlRef() { return net.minecraft.client.gl.ShaderProgram.getGlRef(); }
public yarnwrap.client.gl.GlUniform getUniform(java.lang.String name) { return new yarnwrap.client.gl.GlUniform(wrapperContained.getUniform(name)); }
// public static yarnwrap.client.gl.GlUniform getUniform(java.lang.String name, ) { return new yarnwrap.client.gl.GlUniform(net.minecraft.client.gl.ShaderProgram.getUniform(name)); }
// public yarnwrap.client.gl.ShaderProgram create(yarnwrap.client.gl.CompiledShader vertexShader,yarnwrap.client.gl.CompiledShader fragmentShader,com.mojang.blaze3d.vertex.VertexFormat format,java.lang.String name) { return new yarnwrap.client.gl.ShaderProgram(wrapperContained.create(vertexShader.wrapperContained,fragmentShader.wrapperContained,format,name)); }
// public static yarnwrap.client.gl.ShaderProgram create(yarnwrap.client.gl.CompiledShader vertexShader,yarnwrap.client.gl.CompiledShader fragmentShader,com.mojang.blaze3d.vertex.VertexFormat format,java.lang.String name, ) { return new yarnwrap.client.gl.ShaderProgram(net.minecraft.client.gl.ShaderProgram.create(vertexShader.wrapperContained,fragmentShader.wrapperContained,format,name)); }
public void set(java.util.List uniforms,java.util.List samplers) { wrapperContained.set(uniforms,samplers); }
// public static void set(java.util.List uniforms,java.util.List samplers, ) { net.minecraft.client.gl.ShaderProgram.set(uniforms,samplers); }
public java.lang.String getDebugLabel() { return wrapperContained.getDebugLabel(); }
// public static java.lang.String getDebugLabel() { return net.minecraft.client.gl.ShaderProgram.getDebugLabel(); }
// public java.util.Map getUniforms() { return wrapperContained.getUniforms(); }
// // public static java.util.Map getUniforms() { return net.minecraft.client.gl.ShaderProgram.getUniforms(); }

}