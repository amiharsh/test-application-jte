libraries{
  maven{}
  pipeline_utils{}
}

application_environments{
  dev{
    ip_addresses = ["1.1.1.1", "2.2.2.2" ]
  	}
  test{
  	ip_addresses = [ "1.1.1.1", "2.2.2.2" ]}
}