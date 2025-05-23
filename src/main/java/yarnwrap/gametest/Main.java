package yarnwrap.gametest;
public class Main { public net.minecraft.gametest.Main wrapperContained; public Main(net.minecraft.gametest.Main wrapperContained) { this.wrapperContained = wrapperContained; }

// public void main(java.lang.String[] args) { wrapperContained.main(args); }
// public static void main(java.lang.String[] args, ) { net.minecraft.gametest.Main.main(args); }

}