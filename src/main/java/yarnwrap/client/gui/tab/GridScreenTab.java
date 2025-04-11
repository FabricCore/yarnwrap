package yarnwrap.client.gui.tab;
public class GridScreenTab { public net.minecraft.client.gui.tab.GridScreenTab wrapperContained; public GridScreenTab(net.minecraft.client.gui.tab.GridScreenTab wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.GridWidget grid() { return new yarnwrap.client.gui.widget.GridWidget(wrapperContained.grid); }
// public void grid(yarnwrap.client.gui.widget.GridWidget value) { wrapperContained.grid = value.wrapperContained; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
public GridScreenTab(yarnwrap.text.Text title) { this.wrapperContained = new net.minecraft.client.gui.tab.GridScreenTab(title.wrapperContained); }

}