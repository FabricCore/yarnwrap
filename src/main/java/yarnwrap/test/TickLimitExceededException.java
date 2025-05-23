package yarnwrap.test;
public class TickLimitExceededException { public net.minecraft.test.TickLimitExceededException wrapperContained; public TickLimitExceededException(net.minecraft.test.TickLimitExceededException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public static yarnwrap.text.Text message() { return new yarnwrap.text.Text(net.minecraft.test.TickLimitExceededException.message); }
// public static void message(yarnwrap.text.Text value, ) { net.minecraft.test.TickLimitExceededException.message = value.wrapperContained; }

public TickLimitExceededException(yarnwrap.text.Text message) { this.wrapperContained = new net.minecraft.test.TickLimitExceededException(message.wrapperContained); }

}