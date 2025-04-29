package yarnwrap.client.gl;
public class GlUniform { public net.minecraft.client.gl.GlUniform wrapperContained; public GlUniform(net.minecraft.client.gl.GlUniform wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.ShaderProgramSetupView program() { return new yarnwrap.client.gl.ShaderProgramSetupView(wrapperContained.program); }
// public void program(yarnwrap.client.gl.ShaderProgramSetupView value) { wrapperContained.program = value.wrapperContained; }
// public static yarnwrap.client.gl.ShaderProgramSetupView program() { return new yarnwrap.client.gl.ShaderProgramSetupView(net.minecraft.client.gl.GlUniform.program); }
// public static void program(yarnwrap.client.gl.ShaderProgramSetupView value, ) { net.minecraft.client.gl.GlUniform.program = value.wrapperContained; }

// public boolean stateDirty() { return wrapperContained.stateDirty; }
// public void stateDirty(boolean value) { wrapperContained.stateDirty = value; }
// public static boolean stateDirty() { return net.minecraft.client.gl.GlUniform.stateDirty; }
// public static void stateDirty(boolean value, ) { net.minecraft.client.gl.GlUniform.stateDirty = value; }

// public int dataType() { return wrapperContained.dataType; }
// public void dataType(int value) { wrapperContained.dataType = value; }
// public static int dataType() { return net.minecraft.client.gl.GlUniform.dataType; }
// public static void dataType(int value, ) { net.minecraft.client.gl.GlUniform.dataType = value; }

// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public static int count() { return net.minecraft.client.gl.GlUniform.count; }
// public static void count(int value, ) { net.minecraft.client.gl.GlUniform.count = value; }

// public int location() { return wrapperContained.location; }
// public void location(int value) { wrapperContained.location = value; }
// public static int location() { return net.minecraft.client.gl.GlUniform.location; }
// public static void location(int value, ) { net.minecraft.client.gl.GlUniform.location = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.client.gl.GlUniform.name; }
// public static void name(java.lang.String value, ) { net.minecraft.client.gl.GlUniform.name = value; }

// public java.nio.IntBuffer intData() { return wrapperContained.intData; }
// public void intData(java.nio.IntBuffer value) { wrapperContained.intData = value; }
// public static java.nio.IntBuffer intData() { return net.minecraft.client.gl.GlUniform.intData; }
// public static void intData(java.nio.IntBuffer value, ) { net.minecraft.client.gl.GlUniform.intData = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.gl.GlUniform.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.gl.GlUniform.LOGGER = value; }

// public java.nio.FloatBuffer floatData() { return wrapperContained.floatData; }
// public void floatData(java.nio.FloatBuffer value) { wrapperContained.floatData = value; }
// public static java.nio.FloatBuffer floatData() { return net.minecraft.client.gl.GlUniform.floatData; }
// public static void floatData(java.nio.FloatBuffer value, ) { net.minecraft.client.gl.GlUniform.floatData = value; }

public GlUniform(java.lang.String name,int dataType,int count,yarnwrap.client.gl.ShaderProgramSetupView program) { this.wrapperContained = new net.minecraft.client.gl.GlUniform(name,dataType,count,program.wrapperContained); }
// public void uploadMatrix() { wrapperContained.uploadMatrix(); }
// public static void uploadMatrix() { net.minecraft.client.gl.GlUniform.uploadMatrix(); }
public void setLocation(int location) { wrapperContained.setLocation(location); }
// public static void setLocation(int location, ) { net.minecraft.client.gl.GlUniform.setLocation(location); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.client.gl.GlUniform.getName(); }
// public int getTypeIndex(java.lang.String typeName) { return wrapperContained.getTypeIndex(typeName); }
// public static int getTypeIndex(java.lang.String typeName, ) { return net.minecraft.client.gl.GlUniform.getTypeIndex(typeName); }
public void upload() { wrapperContained.upload(); }
// public static void upload() { net.minecraft.client.gl.GlUniform.upload(); }
// public void uploadFloats() { wrapperContained.uploadFloats(); }
// public static void uploadFloats() { net.minecraft.client.gl.GlUniform.uploadFloats(); }
// public void markStateDirty() { wrapperContained.markStateDirty(); }
// public static void markStateDirty() { net.minecraft.client.gl.GlUniform.markStateDirty(); }
// public void uploadInts() { wrapperContained.uploadInts(); }
// public static void uploadInts() { net.minecraft.client.gl.GlUniform.uploadInts(); }
// public void uniform1(int location,int value) { wrapperContained.uniform1(location,value); }
// public static void uniform1(int location,int value, ) { net.minecraft.client.gl.GlUniform.uniform1(location,value); }
// public int getUniformLocation(int program,java.lang.CharSequence name) { return wrapperContained.getUniformLocation(program,name); }
// public static int getUniformLocation(int program,java.lang.CharSequence name, ) { return net.minecraft.client.gl.GlUniform.getUniformLocation(program,name); }
// public int getAttribLocation(int program,java.lang.CharSequence name) { return wrapperContained.getAttribLocation(program,name); }
// public static int getAttribLocation(int program,java.lang.CharSequence name, ) { return net.minecraft.client.gl.GlUniform.getAttribLocation(program,name); }
// public void bindAttribLocation(int program,int index,java.lang.CharSequence name) { wrapperContained.bindAttribLocation(program,index,name); }
// public static void bindAttribLocation(int program,int index,java.lang.CharSequence name, ) { net.minecraft.client.gl.GlUniform.bindAttribLocation(program,index,name); }
public void set(int index,float value) { wrapperContained.set(index,value); }
// public static void set(int index,float value, ) { net.minecraft.client.gl.GlUniform.set(index,value); }
public int getLocation() { return wrapperContained.getLocation(); }
// public static int getLocation() { return net.minecraft.client.gl.GlUniform.getLocation(); }
public int getCount() { return wrapperContained.getCount(); }
// public static int getCount() { return net.minecraft.client.gl.GlUniform.getCount(); }
public int getDataType() { return wrapperContained.getDataType(); }
// public static int getDataType() { return net.minecraft.client.gl.GlUniform.getDataType(); }
public java.nio.IntBuffer getIntData() { return wrapperContained.getIntData(); }
// public static java.nio.IntBuffer getIntData() { return net.minecraft.client.gl.GlUniform.getIntData(); }
public java.nio.FloatBuffer getFloatData() { return wrapperContained.getFloatData(); }
// public static java.nio.FloatBuffer getFloatData() { return net.minecraft.client.gl.GlUniform.getFloatData(); }

}