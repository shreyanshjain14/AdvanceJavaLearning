package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configure.MyConnection;
import com.ltts.model.Player;

public class PlayerDao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into _player values(?,?,?,?,?,?)");
		ps.setInt(1, p.getPid());
		ps.setString(2, p.getName());
		ps.setDate(3, p.getDate());
		ps.setInt(4, p.getRun());
		ps.setInt(5, p.getWic());
		ps.setString(6, p.getCountry());


		return ps.execute();
		//return false;

		
	}

	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		Statement ps=mc.createStatement();
		ResultSet rs=ps.executeQuery("select * from _player");
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getString(6)));

		}
		return li;

	}
	public Player getPlayerById(int id) throws Exception {
		Player p=new Player();
		List<Player> li=getAllPlayers();
		for(Player p1:li) {
			if(p1.getPid() == id) {
				p.setPid(id);
				p.setName(p1.getName());
				p.setCountry(p1.getCountry());
			}
		}

		return p;
	}
	public Boolean updatePlayer(int id,String pname,String count) throws Exception
	{
		Connection mc=MyConnection.getConnection();
		PreparedStatement ps=mc.prepareStatement("UPDATE _player SET name=?,country=? where pid=?");
		ps.setString(1,pname);
		ps.setString(2, count);
		ps.setInt(3,id);
		Boolean b=ps.execute();
		return b;
	}


}
