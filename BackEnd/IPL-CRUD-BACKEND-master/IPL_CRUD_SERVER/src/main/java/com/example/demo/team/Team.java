package com.example.demo.team;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.example.demo.player.Player;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;


@Entity
@Table(name = "team_table")
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int team_id;
	@Column(name = "team")
	private String team;
	@Column(name = "description")
	private String description;
	@Column(name = "owner")
	private String owner;
	@Column(name = "total_played")
	private int totalPlayed;
	@Column(name = "total_won")
	private int totalWon;
	@Column(name = "total_lost")
	private int totalLost;
	@Column(name = "no_result")
	private int noResult;
	
	@OneToMany(mappedBy = "team", cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
	private List<Player> players = new ArrayList<>();
	
	public Team() { }

	

	public int getTeam_id() {
		return team_id;
	}



	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}



	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getTotalPlayed() {
		return totalPlayed;
	}

	public void setTotalPlayed(int totalPlayed) {
		this.totalPlayed = totalPlayed;
	}

	public int getTotalWon() {
		return totalWon;
	}

	public void setTotalWon(int totalWon) {
		this.totalWon = totalWon;
	}

	public int getTotalLost() {
		return totalLost;
	}

	public void setTotalLost(int totalLost) {
		this.totalLost = totalLost;
	}

	public int getNoResult() {
		return noResult;
	}

	public void setNoResult(int noResult) {
		this.noResult = noResult;
	}
	
}