libraries{
  maven{
    message: "Hello From Base Template"
  }
}

application_environments{
  dev{
    ip_addresses = ["1.1.1.1", "2.2.2.2" ]
  	}
  test{
  	ip_addresses = [ "1.1.1.1", "2.2.2.2" ]}
}