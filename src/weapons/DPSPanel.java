package weapons;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Box;

import etc.Constants;
import etc.UIBuilder;

public class DPSPanel extends JPanel {

	public JPanel status = new JPanel();
	public JPanel stats = new JPanel();

	public JPanel impactPanel = new JPanel();
	public JPanel puncturePanel = new JPanel();
	public JPanel slashPanel = new JPanel();
	public JPanel firePanel = new JPanel();
	public JPanel icePanel = new JPanel();
	public JPanel electricPanel = new JPanel();
	public JPanel toxinPanel = new JPanel();
	public JPanel blastPanel = new JPanel();
	public JPanel magneticPanel = new JPanel();
	public JPanel gasPanel = new JPanel();
	public JPanel radiationPanel = new JPanel();
	public JPanel corrosivePanel = new JPanel();
	public JPanel viralPanel = new JPanel();
	public JPanel projectilesPanel = new JPanel();
	public JPanel FRPanel = new JPanel();
	public JPanel CCPanel = new JPanel();
	public JPanel CDPanel = new JPanel();
	public JPanel SCPanel = new JPanel();
	public JPanel modifiedSCPanel = new JPanel();
	public JPanel magPanel = new JPanel();
	public JPanel reloadPanel = new JPanel();
	public JPanel damagePanel = new JPanel();
	public JPanel slashProcPanel = new JPanel();
	public JPanel toxinProcPanel = new JPanel();
	public JPanel gasProcPanel = new JPanel();
	public JPanel electricProcPanel = new JPanel();
	public JPanel fireProcPanel = new JPanel();
	public JPanel burstPanel = new JPanel();
	public JPanel sustainedPanel = new JPanel();
	public JPanel impactChancePanel = new JPanel();
	public JPanel punctureChancePanel = new JPanel();
	public JPanel slashChancePanel = new JPanel();
	public JPanel fireChancePanel = new JPanel();
	public JPanel iceChancePanel = new JPanel();
	public JPanel electricChancePanel = new JPanel();
	public JPanel toxinChancePanel = new JPanel();
	public JPanel blastChancePanel = new JPanel();
	public JPanel magneticChancePanel = new JPanel();
	public JPanel gasChancePanel = new JPanel();
	public JPanel radiationChancePanel = new JPanel();
	public JPanel corrosiveChancePanel = new JPanel();
	public JPanel viralChancePanel = new JPanel();
	public JPanel corpusPanel = new JPanel();
	public JPanel grineerPanel = new JPanel();
	public JPanel infestedPanel = new JPanel();
	public JPanel corruptedPanel = new JPanel();

	protected JLabel impactLabel = new JLabel("Impact - ");
	protected JLabel punctureLabel = new JLabel("Puncture - ");
	protected JLabel slashLabel = new JLabel("Slash - ");
	protected JLabel fireLabel = new JLabel("Heat - ");
	protected JLabel iceLabel = new JLabel("Cold - ");
	protected JLabel electricLabel = new JLabel("Electric - ");
	protected JLabel toxinLabel = new JLabel("Toxin - ");
	protected JLabel blastLabel = new JLabel("Blast - ");
	protected JLabel magneticLabel = new JLabel("Magnetic - ");
	protected JLabel gasLabel = new JLabel("Gas - ");
	protected JLabel radiationLabel = new JLabel("Radiation - ");
	protected JLabel corrosiveLabel = new JLabel("Corrosive - ");
	protected JLabel viralLabel = new JLabel("Viral - ");
	protected JLabel projectilesLabel = new JLabel("Projectiles - ");
	protected JLabel FRLabel = new JLabel("Fire Rate - ");
	protected JLabel CCLabel = new JLabel("Crit Chance - ");
	protected JLabel CDLabel = new JLabel("Crit Damage - ");
	protected JLabel SCLabel = new JLabel("Status Chance - ");
	protected JLabel modifiedSCLabel = new JLabel("Status (with MS) - ");
	protected JLabel magLabel = new JLabel("Magazine - ");
	protected JLabel reloadLabel = new JLabel("Reload Time - ");
	protected JLabel damageLabel = new JLabel("Damage per Shot - ");
	protected JLabel slashProcLabel = new JLabel("Slash Proc DPS - ");
	protected JLabel toxinProcLabel = new JLabel("Toxin Proc DPS - ");
	protected JLabel gasProcLabel = new JLabel("GasProcDPS - ");
	protected JLabel electricProcLabel = new JLabel("Electric Proc DPS - ");
	protected JLabel fireProcLabel = new JLabel("Fire Proc DPS - ");
	protected JLabel burstLabel = new JLabel("Burst DPS - ");
	protected JLabel sustainedLabel = new JLabel("Sustained DPS - ");
	protected JLabel impactChanceLabel = new JLabel("Impact Chance - ");
	protected JLabel punctureChanceLabel = new JLabel("Puncture Chance - ");
	protected JLabel slashChanceLabel = new JLabel("Slash Chance - ");
	protected JLabel fireChanceLabel = new JLabel("Ignite Chance - ");
	protected JLabel iceChanceLabel = new JLabel("Freeze Chance - ");
	protected JLabel electricChanceLabel = new JLabel("Electric Chance - ");
	protected JLabel toxinChanceLabel = new JLabel("Poison Chance - ");
	protected JLabel blastChanceLabel = new JLabel("Blast Chance - ");
	protected JLabel magneticChanceLabel = new JLabel("Magnetic Chance - ");
	protected JLabel gasChanceLabel = new JLabel("Gas Chance - ");
	protected JLabel radiationChanceLabel = new JLabel("Radiation Chance - ");
	protected JLabel corrosiveChanceLabel = new JLabel("Corrosive Chance - ");
	protected JLabel viralChanceLabel = new JLabel("Viral Chance - ");
	protected JLabel corpusLabel = new JLabel("DPS to Corpus - ");
	protected JLabel grineerLabel = new JLabel("DPS to Grineer - ");
	protected JLabel infestedLabel = new JLabel("DPS to Infested - ");
	protected JLabel corruptedLabel = new JLabel("DPS to Corrupted - ");

	public JTextField impactField = new JTextField(8);
	public JTextField punctureField = new JTextField(8);
	public JTextField slashField = new JTextField(8);
	public JTextField fireField = new JTextField(8);
	public JTextField iceField = new JTextField(8);
	public JTextField electricField = new JTextField(8);
	public JTextField toxinField = new JTextField(8);
	public JTextField blastField = new JTextField(8);
	public JTextField magneticField = new JTextField(8);
	public JTextField gasField = new JTextField(8);
	public JTextField radiationField = new JTextField(8);
	public JTextField corrosiveField = new JTextField(8);
	public JTextField viralField = new JTextField(8);
	public JTextField projectilesField = new JTextField(8);
	public JTextField FRField = new JTextField(8);
	public JTextField CCField = new JTextField(8);
	public JTextField CDField = new JTextField(8);
	public JTextField SCField = new JTextField(8);
	public JTextField modifiedSCField = new JTextField(8);
	public JTextField magField = new JTextField(8);
	public JTextField reloadField = new JTextField(8);
	public JTextField damageField = new JTextField(8);
	public JTextField slashProcField = new JTextField(8);
	public JTextField toxinProcField = new JTextField(8);
	public JTextField gasProcField = new JTextField(8);
	public JTextField electricProcField = new JTextField(8);
	public JTextField fireProcField = new JTextField(8);
	public JTextField burstField = new JTextField(8);
	public JTextField sustainedField = new JTextField(8);
	public JTextField impactChanceField = new JTextField(8);
	public JTextField punctureChanceField = new JTextField(8);
	public JTextField slashChanceField = new JTextField(8);
	public JTextField fireChanceField = new JTextField(8);
	public JTextField iceChanceField = new JTextField(8);
	public JTextField electricChanceField = new JTextField(8);
	public JTextField toxinChanceField = new JTextField(8);
	public JTextField blastChanceField = new JTextField(8);
	public JTextField magneticChanceField = new JTextField(8);
	public JTextField gasChanceField = new JTextField(8);
	public JTextField radiationChanceField = new JTextField(8);
	public JTextField corrosiveChanceField = new JTextField(8);
	public JTextField viralChanceField = new JTextField(8);
	public JTextField corpusField = new JTextField(8);
	public JTextField grineerField = new JTextField(8);
	public JTextField infestedField = new JTextField(8);
	public JTextField corruptedField = new JTextField(8);

	public DPSPanel() {
		buildUI();
	}

	public void buildUI() {
		UIBuilder.labelInit(impactLabel);
		UIBuilder.labelInit(punctureLabel);
		UIBuilder.labelInit(slashLabel);
		UIBuilder.labelInit(fireLabel);
		UIBuilder.labelInit(iceLabel);
		UIBuilder.labelInit(electricLabel);
		UIBuilder.labelInit(toxinLabel);
		UIBuilder.labelInit(blastLabel);
		UIBuilder.labelInit(magneticLabel);
		UIBuilder.labelInit(gasLabel);
		UIBuilder.labelInit(radiationLabel);
		UIBuilder.labelInit(corrosiveLabel);
		UIBuilder.labelInit(viralLabel);
		UIBuilder.labelInit(projectilesLabel);
		UIBuilder.labelInit(FRLabel);
		UIBuilder.labelInit(CCLabel);
		UIBuilder.labelInit(CDLabel);
		UIBuilder.labelInit(SCLabel);
		UIBuilder.labelInit(modifiedSCLabel);
		UIBuilder.labelInit(magLabel);
		UIBuilder.labelInit(reloadLabel);
		UIBuilder.labelInit(damageLabel);
		UIBuilder.labelInit(slashProcLabel);
		UIBuilder.labelInit(toxinProcLabel);
		UIBuilder.labelInit(gasProcLabel);
		UIBuilder.labelInit(electricProcLabel);
		UIBuilder.labelInit(fireProcLabel);
		UIBuilder.labelInit(burstLabel);
		UIBuilder.labelInit(sustainedLabel);
		UIBuilder.labelInit(impactChanceLabel);
		UIBuilder.labelInit(punctureChanceLabel);
		UIBuilder.labelInit(slashChanceLabel);
		UIBuilder.labelInit(fireChanceLabel);
		UIBuilder.labelInit(iceChanceLabel);
		UIBuilder.labelInit(electricChanceLabel);
		UIBuilder.labelInit(toxinChanceLabel);
		UIBuilder.labelInit(blastChanceLabel);
		UIBuilder.labelInit(magneticChanceLabel);
		UIBuilder.labelInit(gasChanceLabel);
		UIBuilder.labelInit(radiationChanceLabel);
		UIBuilder.labelInit(corrosiveChanceLabel);
		UIBuilder.labelInit(viralChanceLabel);
		UIBuilder.labelInit(corpusLabel);
		UIBuilder.labelInit(grineerLabel);
		UIBuilder.labelInit(infestedLabel);
		UIBuilder.labelInit(corruptedLabel);

		UIBuilder.textFieldInit(impactField);
		UIBuilder.textFieldInit(punctureField);
		UIBuilder.textFieldInit(slashField);
		UIBuilder.textFieldInit(fireField);
		UIBuilder.textFieldInit(iceField);
		UIBuilder.textFieldInit(electricField);
		UIBuilder.textFieldInit(toxinField);
		UIBuilder.textFieldInit(blastField);
		UIBuilder.textFieldInit(magneticField);
		UIBuilder.textFieldInit(gasField);
		UIBuilder.textFieldInit(radiationField);
		UIBuilder.textFieldInit(corrosiveField);
		UIBuilder.textFieldInit(viralField);
		UIBuilder.textFieldInit(projectilesField);
		UIBuilder.textFieldInit(FRField);
		UIBuilder.textFieldInit(CCField);
		UIBuilder.textFieldInit(CDField);
		UIBuilder.textFieldInit(SCField);
		UIBuilder.textFieldInit(modifiedSCField);
		UIBuilder.textFieldInit(magField);
		UIBuilder.textFieldInit(reloadField);
		UIBuilder.textFieldInit(damageField);
		UIBuilder.textFieldInit(slashProcField);
		UIBuilder.textFieldInit(toxinProcField);
		UIBuilder.textFieldInit(gasProcField);
		UIBuilder.textFieldInit(electricProcField);
		UIBuilder.textFieldInit(fireProcField);
		UIBuilder.textFieldInit(burstField);
		UIBuilder.textFieldInit(sustainedField);
		UIBuilder.textFieldInit(impactChanceField);
		UIBuilder.textFieldInit(punctureChanceField);
		UIBuilder.textFieldInit(slashChanceField);
		UIBuilder.textFieldInit(fireChanceField);
		UIBuilder.textFieldInit(iceChanceField);
		UIBuilder.textFieldInit(electricChanceField);
		UIBuilder.textFieldInit(toxinChanceField);
		UIBuilder.textFieldInit(blastChanceField);
		UIBuilder.textFieldInit(magneticChanceField);
		UIBuilder.textFieldInit(gasChanceField);
		UIBuilder.textFieldInit(radiationChanceField);
		UIBuilder.textFieldInit(corrosiveChanceField);
		UIBuilder.textFieldInit(viralChanceField);
		UIBuilder.textFieldInit(corpusField);
		UIBuilder.textFieldInit(grineerField);
		UIBuilder.textFieldInit(infestedField);
		UIBuilder.textFieldInit(corruptedField);

		UIBuilder.createSepparationBorder(impactPanel);
		UIBuilder.createSepparationBorder(puncturePanel);
		UIBuilder.createSepparationBorder(slashPanel);
		UIBuilder.createSepparationBorder(firePanel);
		UIBuilder.createSepparationBorder(icePanel);
		UIBuilder.createSepparationBorder(electricPanel);
		UIBuilder.createSepparationBorder(toxinPanel);
		UIBuilder.createSepparationBorder(blastPanel);
		UIBuilder.createSepparationBorder(magneticPanel);
		UIBuilder.createSepparationBorder(gasPanel);
		UIBuilder.createSepparationBorder(radiationPanel);
		UIBuilder.createSepparationBorder(corrosivePanel);
		UIBuilder.createSepparationBorder(viralPanel);
		UIBuilder.createSepparationBorder(projectilesPanel);
		UIBuilder.createSepparationBorder(FRPanel);
		UIBuilder.createSepparationBorder(CCPanel);
		UIBuilder.createSepparationBorder(CDPanel);
		UIBuilder.createSepparationBorder(SCPanel);
		UIBuilder.createSepparationBorder(modifiedSCPanel);
		UIBuilder.createSepparationBorder(magPanel);
		UIBuilder.createSepparationBorder(reloadPanel);
		UIBuilder.createSepparationBorder(damagePanel);
		UIBuilder.createSepparationBorder(slashProcPanel);
		UIBuilder.createSepparationBorder(toxinProcPanel);
		UIBuilder.createSepparationBorder(gasProcPanel);
		UIBuilder.createSepparationBorder(electricProcPanel);
		UIBuilder.createSepparationBorder(fireProcPanel);
		UIBuilder.createSepparationBorder(burstPanel);
		UIBuilder.createSepparationBorder(sustainedPanel);
		UIBuilder.createSepparationBorder(impactChancePanel);
		UIBuilder.createSepparationBorder(punctureChancePanel);
		UIBuilder.createSepparationBorder(slashChancePanel);
		UIBuilder.createSepparationBorder(fireChancePanel);
		UIBuilder.createSepparationBorder(iceChancePanel);
		UIBuilder.createSepparationBorder(electricChancePanel);
		UIBuilder.createSepparationBorder(toxinChancePanel);
		UIBuilder.createSepparationBorder(blastChancePanel);
		UIBuilder.createSepparationBorder(magneticChancePanel);
		UIBuilder.createSepparationBorder(gasChancePanel);
		UIBuilder.createSepparationBorder(radiationChancePanel);
		UIBuilder.createSepparationBorder(corrosiveChancePanel);
		UIBuilder.createSepparationBorder(viralChancePanel);
		UIBuilder.createSepparationBorder(corpusPanel);
		UIBuilder.createSepparationBorder(grineerPanel);
		UIBuilder.createSepparationBorder(infestedPanel);
		UIBuilder.createSepparationBorder(corruptedPanel);

		UIBuilder.panelInit(this);
		UIBuilder.panelInit(impactPanel);
		UIBuilder.panelInit(puncturePanel);
		UIBuilder.panelInit(slashPanel);
		UIBuilder.panelInit(firePanel);
		UIBuilder.panelInit(icePanel);
		UIBuilder.panelInit(electricPanel);
		UIBuilder.panelInit(toxinPanel);
		UIBuilder.panelInit(blastPanel);
		UIBuilder.panelInit(magneticPanel);
		UIBuilder.panelInit(gasPanel);
		UIBuilder.panelInit(radiationPanel);
		UIBuilder.panelInit(corrosivePanel);
		UIBuilder.panelInit(viralPanel);
		UIBuilder.panelInit(projectilesPanel);
		UIBuilder.panelInit(FRPanel);
		UIBuilder.panelInit(CCPanel);
		UIBuilder.panelInit(CDPanel);
		UIBuilder.panelInit(SCPanel);
		UIBuilder.panelInit(modifiedSCPanel);
		UIBuilder.panelInit(magPanel);
		UIBuilder.panelInit(reloadPanel);
		UIBuilder.panelInit(damagePanel);
		UIBuilder.panelInit(slashProcPanel);
		UIBuilder.panelInit(toxinProcPanel);
		UIBuilder.panelInit(gasProcPanel);
		UIBuilder.panelInit(electricProcPanel);
		UIBuilder.panelInit(fireProcPanel);
		UIBuilder.panelInit(burstPanel);
		UIBuilder.panelInit(sustainedPanel);
		UIBuilder.panelInit(impactChancePanel);
		UIBuilder.panelInit(punctureChancePanel);
		UIBuilder.panelInit(slashChancePanel);
		UIBuilder.panelInit(fireChancePanel);
		UIBuilder.panelInit(iceChancePanel);
		UIBuilder.panelInit(electricChancePanel);
		UIBuilder.panelInit(toxinChancePanel);
		UIBuilder.panelInit(blastChancePanel);
		UIBuilder.panelInit(magneticChancePanel);
		UIBuilder.panelInit(gasChancePanel);
		UIBuilder.panelInit(radiationChancePanel);
		UIBuilder.panelInit(corrosiveChancePanel);
		UIBuilder.panelInit(viralChancePanel);
		UIBuilder.panelInit(stats);
		UIBuilder.panelInit(status);
		UIBuilder.panelInit(corpusPanel);
		UIBuilder.panelInit(grineerPanel);
		UIBuilder.panelInit(infestedPanel);
		UIBuilder.panelInit(corruptedPanel);

		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

		impactPanel.setLayout(new GridLayout(1, 2, 0, 0));
		puncturePanel.setLayout(new GridLayout(1, 2, 0, 0));
		slashPanel.setLayout(new GridLayout(1, 2, 0, 0));
		firePanel.setLayout(new GridLayout(1, 2, 0, 0));
		icePanel.setLayout(new GridLayout(1, 2, 0, 0));
		electricPanel.setLayout(new GridLayout(1, 2, 0, 0));
		toxinPanel.setLayout(new GridLayout(1, 2, 0, 0));
		blastPanel.setLayout(new GridLayout(1, 2, 0, 0));
		magneticPanel.setLayout(new GridLayout(1, 2, 0, 0));
		gasPanel.setLayout(new GridLayout(1, 2, 0, 0));
		radiationPanel.setLayout(new GridLayout(1, 2, 0, 0));
		corrosivePanel.setLayout(new GridLayout(1, 2, 0, 0));
		viralPanel.setLayout(new GridLayout(1, 2, 0, 0));
		projectilesPanel.setLayout(new GridLayout(1, 2, 0, 0));
		FRPanel.setLayout(new GridLayout(1, 2, 0, 0));
		CCPanel.setLayout(new GridLayout(1, 2, 0, 0));
		CDPanel.setLayout(new GridLayout(1, 2, 0, 0));
		SCPanel.setLayout(new GridLayout(1, 2, 0, 0));
		modifiedSCPanel.setLayout(new GridLayout(1, 2, 0, 0));
		magPanel.setLayout(new GridLayout(1, 2, 0, 0));
		reloadPanel.setLayout(new GridLayout(1, 2, 0, 0));
		damagePanel.setLayout(new GridLayout(1, 2, 0, 0));
		slashProcPanel.setLayout(new GridLayout(1, 2, 0, 0));
		toxinProcPanel.setLayout(new GridLayout(1, 2, 0, 0));
		gasProcPanel.setLayout(new GridLayout(1, 2, 0, 0));
		electricProcPanel.setLayout(new GridLayout(1, 2, 0, 0));
		fireProcPanel.setLayout(new GridLayout(1, 2, 0, 0));
		burstPanel.setLayout(new GridLayout(1, 2, 0, 0));
		sustainedPanel.setLayout(new GridLayout(1, 2, 0, 0));
		impactChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		punctureChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		slashChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		fireChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		iceChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		electricChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		toxinChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		blastChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		magneticChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		gasChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		radiationChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		corrosiveChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		viralChancePanel.setLayout(new GridLayout(1, 2, 0, 0));
		corpusPanel.setLayout(new GridLayout(1, 2, 0, 0));
		grineerPanel.setLayout(new GridLayout(1, 2, 0, 0));
		infestedPanel.setLayout(new GridLayout(1, 2, 0, 0));
		corruptedPanel.setLayout(new GridLayout(1, 2, 0, 0));

		this.setMinimumSize(new Dimension(0, 580));
		impactPanel.setMaximumSize(new Dimension(250, 20));
		puncturePanel.setMaximumSize(new Dimension(250, 20));
		slashPanel.setMaximumSize(new Dimension(250, 20));
		firePanel.setMaximumSize(new Dimension(250, 20));
		icePanel.setMaximumSize(new Dimension(250, 20));
		electricPanel.setMaximumSize(new Dimension(250, 20));
		toxinPanel.setMaximumSize(new Dimension(250, 20));
		blastPanel.setMaximumSize(new Dimension(250, 20));
		magneticPanel.setMaximumSize(new Dimension(250, 20));
		gasPanel.setMaximumSize(new Dimension(250, 20));
		radiationPanel.setMaximumSize(new Dimension(250, 20));
		corrosivePanel.setMaximumSize(new Dimension(250, 20));
		viralPanel.setMaximumSize(new Dimension(250, 20));
		projectilesPanel.setMaximumSize(new Dimension(250, 20));
		FRPanel.setMaximumSize(new Dimension(250, 20));
		CCPanel.setMaximumSize(new Dimension(250, 20));
		CDPanel.setMaximumSize(new Dimension(250, 20));
		SCPanel.setMaximumSize(new Dimension(250, 20));
		modifiedSCPanel.setMaximumSize(new Dimension(250, 20));
		magPanel.setMaximumSize(new Dimension(250, 20));
		reloadPanel.setMaximumSize(new Dimension(250, 20));
		damagePanel.setMaximumSize(new Dimension(250, 20));
		slashProcPanel.setMaximumSize(new Dimension(250, 20));
		toxinProcPanel.setMaximumSize(new Dimension(250, 20));
		gasProcPanel.setMaximumSize(new Dimension(250, 20));
		electricProcPanel.setMaximumSize(new Dimension(250, 20));
		fireProcPanel.setMaximumSize(new Dimension(250, 20));
		burstPanel.setMaximumSize(new Dimension(250, 20));
		sustainedPanel.setMaximumSize(new Dimension(250, 20));
		impactChancePanel.setMaximumSize(new Dimension(250, 20));
		punctureChancePanel.setMaximumSize(new Dimension(250, 20));
		slashChancePanel.setMaximumSize(new Dimension(250, 20));
		fireChancePanel.setMaximumSize(new Dimension(250, 20));
		iceChancePanel.setMaximumSize(new Dimension(250, 20));
		electricChancePanel.setMaximumSize(new Dimension(250, 20));
		toxinChancePanel.setMaximumSize(new Dimension(250, 20));
		blastChancePanel.setMaximumSize(new Dimension(250, 20));
		magneticChancePanel.setMaximumSize(new Dimension(250, 20));
		gasChancePanel.setMaximumSize(new Dimension(250, 20));
		radiationChancePanel.setMaximumSize(new Dimension(250, 20));
		corrosiveChancePanel.setMaximumSize(new Dimension(250, 20));
		viralChancePanel.setMaximumSize(new Dimension(250, 20));
		corpusPanel.setMaximumSize(new Dimension(250, 20));
		grineerPanel.setMaximumSize(new Dimension(250, 20));
		infestedPanel.setMaximumSize(new Dimension(250, 20));
		corruptedPanel.setMaximumSize(new Dimension(250, 20));

		impactPanel.add(impactLabel);
		impactPanel.add(impactField);
		puncturePanel.add(punctureLabel);
		puncturePanel.add(punctureField);
		slashPanel.add(slashLabel);
		slashPanel.add(slashField);
		firePanel.add(fireLabel);
		firePanel.add(fireField);
		icePanel.add(iceLabel);
		icePanel.add(iceField);
		electricPanel.add(electricLabel);
		electricPanel.add(electricField);
		toxinPanel.add(toxinLabel);
		toxinPanel.add(toxinField);
		blastPanel.add(blastLabel);
		blastPanel.add(blastField);
		magneticPanel.add(magneticLabel);
		magneticPanel.add(magneticField);
		gasPanel.add(gasLabel);
		gasPanel.add(gasField);
		radiationPanel.add(radiationLabel);
		radiationPanel.add(radiationField);
		corrosivePanel.add(corrosiveLabel);
		corrosivePanel.add(corrosiveField);
		viralPanel.add(viralLabel);
		viralPanel.add(viralField);
		projectilesPanel.add(projectilesLabel);
		projectilesPanel.add(projectilesField);
		FRPanel.add(FRLabel);
		FRPanel.add(FRField);
		CCPanel.add(CCLabel);
		CCPanel.add(CCField);
		CDPanel.add(CDLabel);
		CDPanel.add(CDField);
		SCPanel.add(SCLabel);
		SCPanel.add(SCField);
		modifiedSCPanel.add(modifiedSCLabel);
		modifiedSCPanel.add(modifiedSCField);
		magPanel.add(magLabel);
		magPanel.add(magField);
		reloadPanel.add(reloadLabel);
		reloadPanel.add(reloadField);
		damagePanel.add(damageLabel);
		damagePanel.add(damageField);
		slashProcPanel.add(slashProcLabel);
		slashProcPanel.add(slashProcField);
		toxinProcPanel.add(toxinProcLabel);
		toxinProcPanel.add(toxinProcField);
		gasProcPanel.add(gasProcLabel);
		gasProcPanel.add(gasProcField);
		electricProcPanel.add(electricProcLabel);
		electricProcPanel.add(electricProcField);
		fireProcPanel.add(fireProcLabel);
		fireProcPanel.add(fireProcField);
		burstPanel.add(burstLabel);
		burstPanel.add(burstField);
		sustainedPanel.add(sustainedLabel);
		sustainedPanel.add(sustainedField);
		impactChancePanel.add(impactChanceLabel);
		impactChancePanel.add(impactChanceField);
		punctureChancePanel.add(punctureChanceLabel);
		punctureChancePanel.add(punctureChanceField);
		slashChancePanel.add(slashChanceLabel);
		slashChancePanel.add(slashChanceField);
		fireChancePanel.add(fireChanceLabel);
		fireChancePanel.add(fireChanceField);
		iceChancePanel.add(iceChanceLabel);
		iceChancePanel.add(iceChanceField);
		electricChancePanel.add(electricChanceLabel);
		electricChancePanel.add(electricChanceField);
		toxinChancePanel.add(toxinChanceLabel);
		toxinChancePanel.add(toxinChanceField);
		blastChancePanel.add(blastChanceLabel);
		blastChancePanel.add(blastChanceField);
		magneticChancePanel.add(magneticChanceLabel);
		magneticChancePanel.add(magneticChanceField);
		gasChancePanel.add(gasChanceLabel);
		gasChancePanel.add(gasChanceField);
		radiationChancePanel.add(radiationChanceLabel);
		radiationChancePanel.add(radiationChanceField);
		corrosiveChancePanel.add(corrosiveChanceLabel);
		corrosiveChancePanel.add(corrosiveChanceField);
		viralChancePanel.add(viralChanceLabel);
		viralChancePanel.add(viralChanceField);
		corpusPanel.add(corpusLabel);
		corpusPanel.add(corpusField);
		grineerPanel.add(grineerLabel);
		grineerPanel.add(grineerField);
		infestedPanel.add(infestedLabel);
		infestedPanel.add(infestedField);
		corruptedPanel.add(corruptedLabel);
		corruptedPanel.add(corruptedField);

		stats.setLayout(new BoxLayout(stats, BoxLayout.Y_AXIS));

		stats.add(impactPanel);
		stats.add(puncturePanel);
		stats.add(slashPanel);
		stats.add(firePanel);
		stats.add(icePanel);
		stats.add(electricPanel);
		stats.add(toxinPanel);
		stats.add(blastPanel);
		stats.add(magneticPanel);
		stats.add(gasPanel);
		stats.add(radiationPanel);
		stats.add(corrosivePanel);
		stats.add(viralPanel);
		stats.add(projectilesPanel);
		stats.add(FRPanel);
		stats.add(CCPanel);
		stats.add(CDPanel);
		stats.add(SCPanel);
		stats.add(modifiedSCPanel);
		stats.add(magPanel);
		stats.add(reloadPanel);
		stats.add(damagePanel);
		stats.add(slashProcPanel);
		stats.add(toxinProcPanel);
		stats.add(gasProcPanel);
		stats.add(electricProcPanel);
		stats.add(fireProcPanel);
		stats.add(burstPanel);
		stats.add(sustainedPanel);
		stats.add(corpusPanel);
		stats.add(grineerPanel);
		stats.add(infestedPanel);
		stats.add(corruptedPanel);

		status.setLayout(new BoxLayout(status, BoxLayout.Y_AXIS));

		status.add(impactChancePanel);
		status.add(punctureChancePanel);
		status.add(slashChancePanel);
		status.add(fireChancePanel);
		status.add(iceChancePanel);
		status.add(electricChancePanel);
		status.add(toxinChancePanel);
		status.add(blastChancePanel);
		status.add(magneticChancePanel);
		status.add(gasChancePanel);
		status.add(radiationChancePanel);
		status.add(corrosiveChancePanel);
		status.add(viralChancePanel);

		JPanel top = new JPanel();
		top.setAlignmentY(JPanel.TOP_ALIGNMENT);
		top.setLayout(new BoxLayout(top, BoxLayout.Y_AXIS));
		top.add(stats);
		top.add(status);

		this.add(top);
		this.add(Box.createGlue());

		impactField.setEditable(false);
		punctureField.setEditable(false);
		slashField.setEditable(false);
		fireField.setEditable(false);
		iceField.setEditable(false);
		electricField.setEditable(false);
		toxinField.setEditable(false);
		blastField.setEditable(false);
		magneticField.setEditable(false);
		gasField.setEditable(false);
		radiationField.setEditable(false);
		corrosiveField.setEditable(false);
		viralField.setEditable(false);
		projectilesField.setEditable(false);
		FRField.setEditable(false);
		CCField.setEditable(false);
		CDField.setEditable(false);
		SCField.setEditable(false);
		modifiedSCField.setEditable(false);
		magField.setEditable(false);
		reloadField.setEditable(false);
		damageField.setEditable(false);
		slashProcField.setEditable(false);
		toxinProcField.setEditable(false);
		gasProcField.setEditable(false);
		electricProcField.setEditable(false);
		fireProcField.setEditable(false);
		burstField.setEditable(false);
		sustainedField.setEditable(false);
		impactChanceField.setEditable(false);
		punctureChanceField.setEditable(false);
		slashChanceField.setEditable(false);
		fireChanceField.setEditable(false);
		iceChanceField.setEditable(false);
		electricChanceField.setEditable(false);
		toxinChanceField.setEditable(false);
		blastChanceField.setEditable(false);
		magneticChanceField.setEditable(false);
		gasChanceField.setEditable(false);
		radiationChanceField.setEditable(false);
		corrosiveChanceField.setEditable(false);
		viralChanceField.setEditable(false);
		
		status.setVisible(false);

		impactField.setToolTipText("Raw impact damage per shot");
		punctureField.setToolTipText("Raw puncture damage per shot");
		slashField.setToolTipText("Raw slash damage per shot");
		fireField.setToolTipText("Raw heat damage per shot");
		iceField.setToolTipText("Raw cold damage per shot");
		electricField.setToolTipText("Raw electric damage per shot");
		toxinField.setToolTipText("Raw toxin damage per shot");
		blastField.setToolTipText("Raw blast damage per shot");
		magneticField.setToolTipText("Raw magnetic damage per shot");
		gasField.setToolTipText("Raw gas damage per shot");
		radiationField.setToolTipText("Raw radiation damage per shot");
		corrosiveField.setToolTipText("Raw corrosive damage per shot");
		viralField.setToolTipText("Raw viral damage per shot");
		projectilesField.setToolTipText("Number of projectiles");
		FRField.setToolTipText("Shots per second");
		CCField.setToolTipText("Critical chance");
		CDField.setToolTipText("Critical Multiplier");
		SCField.setToolTipText("Status Chance per projectile");
		modifiedSCField.setToolTipText("Status chance per shot");
		magField.setToolTipText("Magazine Size");
		reloadField.setToolTipText("Reload time in seconds");
		damageField.setToolTipText("Raw damage Per shot");
		slashProcField.setToolTipText("Maximum sustained bleed damage per second");
		toxinProcField.setToolTipText("Maximum sustained poison damage per second");
		gasProcField.setToolTipText("Maximum sustained gas cloud damage per second");
		electricProcField.setToolTipText("damage from electric procs damage per second");
		fireProcField.setToolTipText("Maximum sustained ignite damage per second");
		burstField.setToolTipText("Damage per second without reload time");
		sustainedField.setToolTipText("Damage per second with reload time");
	}
}