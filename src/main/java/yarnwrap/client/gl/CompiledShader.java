package yarnwrap.client.gl;
public class CompiledShader { public net.minecraft.client.gl.CompiledShader wrapperContained; public CompiledShader(net.minecraft.client.gl.CompiledShader wrapperContained) { this.wrapperContained = wrapperContained; }

// public int CLOSED() { return wrapperContained.CLOSED; }
// public void CLOSED(int value) { wrapperContained.CLOSED = value; }
// public static int CLOSED() { return net.minecraft.client.gl.CompiledShader.CLOSED; }
// public static void CLOSED(int value, ) { net.minecraft.client.gl.CompiledShader.CLOSED = value; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.client.gl.CompiledShader.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.client.gl.CompiledShader.id = value.wrapperContained; }

// public int handle() { return wrapperContained.handle; }
// public void handle(int value) { wrapperContained.handle = value; }
// public static int handle() { return net.minecraft.client.gl.CompiledShader.handle; }
// public static void handle(int value, ) { net.minecraft.client.gl.CompiledShader.handle = value; }

// public yarnwrap.client.gl.CompiledShader INVALID_SHADER() { return new yarnwrap.client.gl.CompiledShader(wrapperContained.INVALID_SHADER); }
// public void INVALID_SHADER(yarnwrap.client.gl.CompiledShader value) { wrapperContained.INVALID_SHADER = value.wrapperContained; }
public static yarnwrap.client.gl.CompiledShader INVALID_SHADER() { return new yarnwrap.client.gl.CompiledShader(net.minecraft.client.gl.CompiledShader.INVALID_SHADER); }
// public static void INVALID_SHADER(yarnwrap.client.gl.CompiledShader value, ) { net.minecraft.client.gl.CompiledShader.INVALID_SHADER = value.wrapperContained; }

// public com.mojang.blaze3d.shaders.ShaderType shaderType() { return wrapperContained.shaderType; }
// public void shaderType(com.mojang.blaze3d.shaders.ShaderType value) { wrapperContained.shaderType = value; }
// public static com.mojang.blaze3d.shaders.ShaderType shaderType() { return net.minecraft.client.gl.CompiledShader.shaderType; }
// public static void shaderType(com.mojang.blaze3d.shaders.ShaderType value, ) { net.minecraft.client.gl.CompiledShader.shaderType = value; }

public CompiledShader(int handle,yarnwrap.util.Identifier id,com.mojang.blaze3d.shaders.ShaderType shaderType) { this.wrapperContained = new net.minecraft.client.gl.CompiledShader(handle,id.wrapperContained,shaderType); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.client.gl.CompiledShader.getId()); }
// public yarnwrap.client.gl.CompiledShader compile(yarnwrap.util.Identifier id,com.mojang.blaze3d.shaders.ShaderType type,java.lang.String source) { return new yarnwrap.client.gl.CompiledShader(wrapperContained.compile(id.wrapperContained,type,source)); }
// public static yarnwrap.client.gl.CompiledShader compile(yarnwrap.util.Identifier id,com.mojang.blaze3d.shaders.ShaderType type,java.lang.String source, ) { return new yarnwrap.client.gl.CompiledShader(net.minecraft.client.gl.CompiledShader.compile(id.wrapperContained,type,source)); }
public int getHandle() { return wrapperContained.getHandle(); }
// public static int getHandle() { return net.minecraft.client.gl.CompiledShader.getHandle(); }
public java.lang.String getDebugLabel() { return wrapperContained.getDebugLabel(); }
// public static java.lang.String getDebugLabel() { return net.minecraft.client.gl.CompiledShader.getDebugLabel(); }

}