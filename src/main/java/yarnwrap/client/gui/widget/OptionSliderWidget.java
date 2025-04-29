package yarnwrap.client.gui.widget;
public class OptionSliderWidget { public net.minecraft.client.gui.widget.OptionSliderWidget wrapperContained; public OptionSliderWidget(net.minecraft.client.gui.widget.OptionSliderWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(wrapperContained.options); }
// public void options(yarnwrap.client.option.GameOptions value) { wrapperContained.options = value.wrapperContained; }
// public static yarnwrap.client.option.GameOptions options() { return new yarnwrap.client.option.GameOptions(net.minecraft.client.gui.widget.OptionSliderWidget.options); }
// public static void options(yarnwrap.client.option.GameOptions value, ) { net.minecraft.client.gui.widget.OptionSliderWidget.options = value.wrapperContained; }

// public OptionSliderWidget(yarnwrap.client.option.GameOptions options,int x,int y,int width,int height,double value) { this.wrapperContained = new net.minecraft.client.gui.widget.OptionSliderWidget(options.wrapperContained,x,y,width,height,value); }

}