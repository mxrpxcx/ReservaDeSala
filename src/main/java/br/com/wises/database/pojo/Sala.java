package br.com.wises.database.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "sala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s"),
    @NamedQuery(name = "Sala.findById", query = "SELECT s FROM Sala s WHERE s.id = :id"),
    @NamedQuery(name = "Sala.findByNome", query = "SELECT s FROM Sala s WHERE s.nome = :nome"),
    @NamedQuery(name = "Sala.findByQuantidadePessoasSentadas", query = "SELECT s FROM Sala s WHERE s.quantidadePessoasSentadas = :quantidadePessoasSentadas"),
    @NamedQuery(name = "Sala.findByPossuiMultimidia", query = "SELECT s FROM Sala s WHERE s.possuiMultimidia = :possuiMultimidia"),
    @NamedQuery(name = "Sala.findByPossuiArcon", query = "SELECT s FROM Sala s WHERE s.possuiArcon = :possuiArcon"),
    @NamedQuery(name = "Sala.findByAreaDaSala", query = "SELECT s FROM Sala s WHERE s.areaDaSala = :areaDaSala"),
    @NamedQuery(name = "Sala.findByLocalizacao", query = "SELECT s FROM Sala s WHERE s.localizacao = :localizacao"),
    @NamedQuery(name = "Sala.findByLatitude", query = "SELECT s FROM Sala s WHERE s.latitude = :latitude"),
    @NamedQuery(name = "Sala.findByLongitude", query = "SELECT s FROM Sala s WHERE s.longitude = :longitude"),
    @NamedQuery(name = "Sala.findByAtivo", query = "SELECT s FROM Sala s WHERE s.ativo = :ativo"),
    @NamedQuery(name = "Sala.findByDataCriacao", query = "SELECT s FROM Sala s WHERE s.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "Sala.findByDataAlteracao", query = "SELECT s FROM Sala s WHERE s.dataAlteracao = :dataAlteracao")})
public class Sala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 45)
    @Column(name = "nome")
    private String nome;
    @Column(name = "quantidadePessoasSentadas")
    private Integer quantidadePessoasSentadas;
    @Column(name = "possuiMultimidia")
    private Short possuiMultimidia;
    @Column(name = "possuiArcon")
    private Short possuiArcon;
    @Column(name = "areaDaSala")
    private BigDecimal areaDaSala;
    @Size(max = 128)
    @Column(name = "localizacao")
    private String localizacao;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "ativo")
    private Short ativo;
    @Column(name = "dataCriacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;
    @Column(name = "dataAlteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlteracao;

    public Sala() {
    }

    public Sala(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadePessoasSentadas() {
        return quantidadePessoasSentadas;
    }

    public void setQuantidadePessoasSentadas(Integer quantidadePessoasSentadas) {
        this.quantidadePessoasSentadas = quantidadePessoasSentadas;
    }

    public Short getPossuiMultimidia() {
        return possuiMultimidia;
    }

    public void setPossuiMultimidia(Short possuiMultimidia) {
        this.possuiMultimidia = possuiMultimidia;
    }

    public Short getPossuiArcon() {
        return possuiArcon;
    }

    public void setPossuiArcon(Short possuiArcon) {
        this.possuiArcon = possuiArcon;
    }

    public BigDecimal getAreaDaSala() {
        return areaDaSala;
    }

    public void setAreaDaSala(BigDecimal areaDaSala) {
        this.areaDaSala = areaDaSala;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Short getAtivo() {
        return ativo;
    }

    public void setAtivo(Short ativo) {
        this.ativo = ativo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    @Override
    public String toString() {
        return "br.com.wises.database.pojo.Sala[ id=" + id + " ]";
    }
    
}
