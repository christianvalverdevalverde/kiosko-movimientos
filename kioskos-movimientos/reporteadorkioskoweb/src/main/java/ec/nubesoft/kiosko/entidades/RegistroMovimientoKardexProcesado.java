package ec.nubesoft.kiosko.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: RegistroMovimientoKardexProcesado
 *
 */
@Entity

public class RegistroMovimientoKardexProcesado implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2102269125635202685L;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal billete_01;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal billete_02;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal billete_05;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal billete_10;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal billete_100;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal billete_20;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal billte_50; 
	private String factura;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaTransaccion;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String kiosko;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal moneda_05;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal moneda_10;
	
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal moneda_100;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal moneda_25;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal moneda_50;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal monenda_01;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal monto;
	private String sucursal;
	@Column(columnDefinition="decimal(10,2) default 0.00")
	private BigDecimal totalMovimiento;
	

	public RegistroMovimientoKardexProcesado() {
		super();
		fechaTransaccion=new Date();
	}


	public BigDecimal getBillete_01() {
		return billete_01;
	}


	public BigDecimal getBillete_02() {
		return billete_02;
	}


	public BigDecimal getBillete_05() {
		return billete_05;
	}


	public BigDecimal getBillete_10() {
		return billete_10;
	}


	public BigDecimal getBillete_100() {
		return billete_100;
	}


	public BigDecimal getBillete_20() {
		return billete_20;
	}


	public BigDecimal getBillte_50() {
		return billte_50;
	}


	public String getFactura() {
		return factura;
	}


	public Date getFechaTransaccion() {
		return fechaTransaccion;
	}


	public Long getId() {
		return id;
	}


	public String getKiosko() {
		return kiosko;
	}


	public BigDecimal getMoneda_05() {
		return moneda_05;
	}


	public BigDecimal getMoneda_10() {
		return moneda_10;
	}


	public BigDecimal getMoneda_100() {
		return moneda_100;
	}


	public BigDecimal getMoneda_25() {
		return moneda_25;
	}


	public BigDecimal getMoneda_50() {
		return moneda_50;
	}


	public BigDecimal getMonenda_01() {
		return monenda_01;
	}


	public BigDecimal getMonto() {
		return monto;
	}


	public String getSucursal() {
		return sucursal;
	}


	public BigDecimal getTotalMovimiento() {
		return totalMovimiento;
	}


	public void setBillete_01(BigDecimal billete_01) {
		this.billete_01 = billete_01;
	}


	public void setBillete_02(BigDecimal billete_02) {
		this.billete_02 = billete_02;
	}


	public void setBillete_05(BigDecimal billete_05) {
		this.billete_05 = billete_05;
	}


	public void setBillete_10(BigDecimal billete_10) {
		this.billete_10 = billete_10;
	}


	public void setBillete_100(BigDecimal billete_100) {
		this.billete_100 = billete_100;
	}


	public void setBillete_20(BigDecimal billete_20) {
		this.billete_20 = billete_20;
	}


	public void setBillte_50(BigDecimal billte_50) {
		this.billte_50 = billte_50;
	}


	public void setFactura(String factura) {
		this.factura = factura;
	}


	public void setFechaTransaccion(Date fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setKiosko(String kiosko) {
		this.kiosko = kiosko;
	}


	public void setMoneda_05(BigDecimal moneda_05) {
		this.moneda_05 = moneda_05;
	}


	public void setMoneda_10(BigDecimal moneda_10) {
		this.moneda_10 = moneda_10;
	}


	public void setMoneda_100(BigDecimal moneda_100) {
		this.moneda_100 = moneda_100;
	}


	public void setMoneda_25(BigDecimal moneda_25) {
		this.moneda_25 = moneda_25;
	}


	public void setMoneda_50(BigDecimal moneda_50) {
		this.moneda_50 = moneda_50;
	}


	public void setMonenda_01(BigDecimal monenda_01) {
		this.monenda_01 = monenda_01;
	}


	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}


	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


	public void setTotalMovimiento(BigDecimal totalMovimiento) {
		this.totalMovimiento = totalMovimiento;
	}
   
}
