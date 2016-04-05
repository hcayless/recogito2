/**
 * This class is generated by jOOQ
 */
package models.generated.tables


import java.lang.Class
import java.lang.String
import java.time.OffsetDateTime
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import models.generated.DefaultSchema
import models.generated.Keys
import models.generated.tables.records.TeamRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl


object Team {

	/**
	 * The reference instance of <code>team</code>
	 */
	val TEAM = new Team
}

/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	),
	comments = "This class is generated by jOOQ"
)
class Team(alias : String, aliased : Table[TeamRecord], parameters : Array[ Field[_] ]) extends TableImpl[TeamRecord](alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[TeamRecord] = {
		classOf[TeamRecord]
	}

	/**
	 * The column <code>team.title</code>.
	 */
	val TITLE : TableField[TeamRecord, String] = createField("title", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>team.created_by</code>.
	 */
	val CREATED_BY : TableField[TeamRecord, String] = createField("created_by", org.jooq.impl.SQLDataType.CLOB.nullable(false), "")

	/**
	 * The column <code>team.created_at</code>.
	 */
	val CREATED_AT : TableField[TeamRecord, OffsetDateTime] = createField("created_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), "")

	/**
	 * Create a <code>team</code> table reference
	 */
	def this() = {
		this("team", null, null)
	}

	/**
	 * Create an aliased <code>team</code> table reference
	 */
	def this(alias : String) = {
		this(alias, models.generated.tables.Team.TEAM, null)
	}

	private def this(alias : String, aliased : Table[TeamRecord]) = {
		this(alias, aliased, null)
	}

	override def getPrimaryKey : UniqueKey[TeamRecord] = {
		Keys.PK_TEAM
	}

	override def getKeys : List[ UniqueKey[TeamRecord] ] = {
		return Arrays.asList[ UniqueKey[TeamRecord] ](Keys.PK_TEAM)
	}

	override def getReferences : List[ ForeignKey[TeamRecord, _] ] = {
		return Arrays.asList[ ForeignKey[TeamRecord, _] ](Keys.FK_TEAM_USER_1)
	}

	override def as(alias : String) : Team = {
		new Team(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : Team = {
		new Team(name, null)
	}
}
