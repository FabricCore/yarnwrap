package yarnwrap.test;
public class GameTestException { public net.minecraft.test.GameTestException wrapperContained; public GameTestException(net.minecraft.test.GameTestException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text message() { return new yarnwrap.text.Text(wrapperContained.message); }
// public void message(yarnwrap.text.Text value) { wrapperContained.message = value.wrapperContained; }
// public static yarnwrap.text.Text message() { return new yarnwrap.text.Text(net.minecraft.test.GameTestException.message); }
// public static void message(yarnwrap.text.Text value, ) { net.minecraft.test.GameTestException.message = value.wrapperContained; }

// public int tick() { return wrapperContained.tick; }
// public void tick(int value) { wrapperContained.tick = value; }
// public static int tick() { return net.minecraft.test.GameTestException.tick; }
// public static void tick(int value, ) { net.minecraft.test.GameTestException.tick = value; }

public GameTestException(yarnwrap.text.Text message,int tick) { this.wrapperContained = new net.minecraft.test.GameTestException(message.wrapperContained,tick); }

}