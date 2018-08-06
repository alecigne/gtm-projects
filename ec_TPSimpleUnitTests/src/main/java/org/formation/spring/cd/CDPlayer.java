package org.formation.spring.cd;

public class CDPlayer implements MediaPlayer {

	private CompactDisc compactDisc;

	public CDPlayer(CompactDisc compactDisc) {
		this.compactDisc = compactDisc;
	}

	@Override
	public boolean play() {
		return compactDisc.play();
	}

}
