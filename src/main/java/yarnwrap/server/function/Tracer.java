package yarnwrap.server.function;
public class Tracer { public net.minecraft.server.function.Tracer wrapperContained; public Tracer(net.minecraft.server.function.Tracer wrapperContained) { this.wrapperContained = wrapperContained; }

public void traceCommandStart(int depth,java.lang.String command) { wrapperContained.traceCommandStart(depth,command); }
public void traceCommandEnd(int depth,java.lang.String command,int result) { wrapperContained.traceCommandEnd(depth,command,result); }
public void traceFunctionCall(int depth,yarnwrap.util.Identifier function,int size) { wrapperContained.traceFunctionCall(depth,function.wrapperContained,size); }
public void traceError(java.lang.String message) { wrapperContained.traceError(message); }

}