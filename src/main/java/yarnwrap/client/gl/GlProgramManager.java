package yarnwrap.client.gl;
public class GlProgramManager { public net.minecraft.client.gl.GlProgramManager wrapperContained; public GlProgramManager(net.minecraft.client.gl.GlProgramManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public void deleteProgram(yarnwrap.client.gl.ShaderProgramSetupView program) { wrapperContained.deleteProgram(program.wrapperContained); }
// public int createProgram() { return wrapperContained.createProgram(); }
public void linkProgram(yarnwrap.client.gl.ShaderProgramSetupView program) { wrapperContained.linkProgram(program.wrapperContained); }
public void useProgram(int program) { wrapperContained.useProgram(program); }

}