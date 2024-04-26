INSERT INTO proveedores (id_proveedor, nombre_prov) VALUES 
(1, 'Proveedor A'),
(2, 'Proveedor B'),
(3, 'Proveedor C'),
(4, 'Proveedor D'),
(5, 'Proveedor E');

INSERT INTO facturas (id_factura, descripcion, fecha_factura) VALUES 
('F001', 'Compra de productos de electrónica', '2024-04-25'),
('F002', 'Compra de suministros de oficina', '2024-04-26'),
('F003', 'Compra de mobiliario', '2024-04-27'),
('F004', 'Compra de productos de limpieza', '2024-04-28'),
('F005', 'Compra de herramientas', '2024-04-29');

INSERT INTO productos (id_producto, nom_prod, qty_producto, bruto, tipo_prod) VALUES 
('1', 'Portátil HP EliteBook', 50, 1200.00, 'N'),
('2', 'Monitor Dell 27"', 100, 299.99, 'N'),
('3', 'Silla ergonómica', 30, 199.99, 'N'),
('4', 'Impresora multifunción Epson', 40, 199.00, 'N'),
('5', 'Teclado inalámbrico Logitech', 80, 49.99, 'N');

INSERT INTO clientes (id_cliente, nombre, apel1, apel2, DNI, fecha_nacimiento, telefono, mail) VALUES 
('C001', 'María', 'González', 'López', '12345678A', '1990-03-15', 987654321, 'maria@example.com'),
('C002', 'Carlos', 'Martínez', 'Ruiz', '23456789B', '1985-07-20', 654987321, 'carlos@example.com'),
('C003', 'Laura', 'Sánchez', 'García', '34567890C', '2000-01-05', 789654123, 'laura@example.com'),
('C004', 'Javier', 'Fernández', 'Díaz', '45678901D', '1978-11-28', 456123789, 'javier@example.com'),
('C005', 'Ana', 'Pérez', 'Martín', '56789012E', '1982-09-10', 321456987, 'ana@example.com');

INSERT INTO incluir (id_pedido, nom_prod, qty_prod_pedido) VALUES 
('P001', 'Portátil HP EliteBook', 2),
('P002', 'Monitor Dell 27"', 1),
('P003', 'Silla ergonómica', 3),
('P004', 'Impresora multifunción Epson', 1),
('P005', 'Teclado inalámbrico Logitech', 2);