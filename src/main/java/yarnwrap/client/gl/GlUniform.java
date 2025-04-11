package yarnwrap.client.gl;
public class GlUniform { public net.minecraft.client.gl.GlUniform wrapperContained; public GlUniform(net.minecraft.client.gl.GlUniform wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gl.ShaderProgramSetupView program() { return new yarnwrap.client.gl.ShaderProgramSetupView(wrapperContained.program); }
// public void program(yarnwrap.client.gl.ShaderProgramSetupView value) { wrapperContained.program = value.wrapperContained; }
// public boolean stateDirty() { return wrapperContained.stateDirty; }
// public void stateDirty(boolean value) { wrapperContained.stateDirty = value; }
// public int dataType() { return wrapperContained.dataType; }
// public void dataType(int value) { wrapperContained.dataType = value; }
// public int count() { return wrapperContained.count; }
// public void count(int value) { wrapperContained.count = value; }
// public int location() { return wrapperContained.location; }
// public void location(int value) { wrapperContained.location = value; }
// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.nio.IntBuffer intData() { return wrapperContained.intData; }
// public void intData(java.nio.IntBuffer value) { wrapperContained.intData = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.nio.FloatBuffer floatData() { return wrapperContained.floatData; }
// public void floatData(java.nio.FloatBuffer value) { wrapperContained.floatData = value; }
// public void uploadMatrix() { wrapperContained.uploadMatrix(); }
public void setLocation(int location) { wrapperContained.setLocation(location); }
public java.lang.String getName() { return wrapperContained.getName(); }
public int getTypeIndex(java.lang.String typeName) { return wrapperContained.getTypeIndex(typeName); }
public void upload() { wrapperContained.upload(); }
// public void uploadFloats() { wrapperContained.uploadFloats(); }
// public void markStateDirty() { wrapperContained.markStateDirty(); }
// public void uploadInts() { wrapperContained.uploadInts(); }
public void uniform1(int location,int value) { wrapperContained.uniform1(location,value); }
public int getUniformLocation(int program,java.lang.CharSequence name) { return wrapperContained.getUniformLocation(program,name); }
public int getAttribLocation(int program,java.lang.CharSequence name) { return wrapperContained.getAttribLocation(program,name); }
public void bindAttribLocation(int program,int index,java.lang.CharSequence name) { wrapperContained.bindAttribLocation(program,index,name); }
public void set(int index,float value) { wrapperContained.set(index,value); }
public int getLocation() { return wrapperContained.getLocation(); }
public int getCount() { return wrapperContained.getCount(); }
public int getDataType() { return wrapperContained.getDataType(); }
public java.nio.IntBuffer getIntData() { return wrapperContained.getIntData(); }
public java.nio.FloatBuffer getFloatData() { return wrapperContained.getFloatData(); }

}