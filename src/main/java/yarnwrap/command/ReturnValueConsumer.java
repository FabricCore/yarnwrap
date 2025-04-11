package yarnwrap.command;
public class ReturnValueConsumer { public net.minecraft.command.ReturnValueConsumer wrapperContained; public ReturnValueConsumer(net.minecraft.command.ReturnValueConsumer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.command.ReturnValueConsumer EMPTY() { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.command.ReturnValueConsumer value) { wrapperContained.EMPTY = value.wrapperContained; }
// public yarnwrap.command.ReturnValueConsumer chain(yarnwrap.command.ReturnValueConsumer a,yarnwrap.command.ReturnValueConsumer b) { return new yarnwrap.command.ReturnValueConsumer(wrapperContained.chain(a.wrapperContained,b.wrapperContained)); }
// public void method_54880(yarnwrap.command.ReturnValueConsumer successful,yarnwrap.command.ReturnValueConsumer returnValue) { wrapperContained.method_54880(successful.wrapperContained,returnValue.wrapperContained); }
public void onResult(boolean successful,int returnValue) { wrapperContained.onResult(successful,returnValue); }
public void onSuccess(int successful) { wrapperContained.onSuccess(successful); }

}