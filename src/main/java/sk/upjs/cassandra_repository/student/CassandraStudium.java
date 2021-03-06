package sk.upjs.cassandra_repository.student;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;
import sk.upjs.nosql_data_source.entity.StudijnyProgram;
import sk.upjs.nosql_data_source.entity.Studium;

@UserDefinedType("studium")
public class CassandraStudium {
    @Column
    private Long id;
    @Column("zaciatok_studia")
    private String zaciatokStudia;
    @Column("koniec_studia")
    private String koniecStudia;
    @Column("id_studijny_program")
    private Long idStudijnyProgram;
    @Column
    private String skratka;
    @Column
    private String popis;

    /*CREATE TYPE IF NOT EXISTS studium (
    id bigint,
    zaciatok_studia text,
    koniec_studia text,
    id_studijny_program bigint,
    skratka text,
    popis text
    );
    */
    public CassandraStudium() {
    }

    public CassandraStudium(Studium studium) {
        id = studium.getId();
        zaciatokStudia = studium.getZaciatokStudia();
        koniecStudia = studium.getKoniecStudia();
        idStudijnyProgram = studium.getStudijnyProgram().getId();
        skratka = studium.getStudijnyProgram().getSkratka();
        popis  = studium.getStudijnyProgram().getPopis();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZaciatokStudia() {
        return zaciatokStudia;
    }

    public void setZaciatokStudia(String zaciatokStudia) {
        this.zaciatokStudia = zaciatokStudia;
    }

    public String getKoniecStudia() {
        return koniecStudia;
    }

    public void setKoniecStudia(String koniecStudia) {
        this.koniecStudia = koniecStudia;
    }

    public Long getIdStudijnyProgram() {
        return idStudijnyProgram;
    }

    public void setIdStudijnyProgram(Long idStudijnyProgram) {
        this.idStudijnyProgram = idStudijnyProgram;
    }

    public String getSkratka() {
        return skratka;
    }

    public void setSkratka(String skratka) {
        this.skratka = skratka;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    @Override
    public String toString() {
        return "CassandraStudium{" +
                "id=" + id +
                ", zaciatokStudia='" + zaciatokStudia + '\'' +
                ", koniecStudia='" + koniecStudia + '\'' +
                ", idStudijnyProgram=" + idStudijnyProgram +
                ", skratka='" + skratka + '\'' +
                ", popis='" + popis + '\'' +
                '}';
    }
}
